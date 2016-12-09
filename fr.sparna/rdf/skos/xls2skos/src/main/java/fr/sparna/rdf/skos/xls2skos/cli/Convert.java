package fr.sparna.rdf.skos.xls2skos.cli;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.RDFWriterRegistry;
import org.eclipse.rdf4j.rio.Rio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.sparna.rdf.skos.xls2skos.ModelWriterFactory;
import fr.sparna.rdf.skos.xls2skos.ModelWriterIfc;
import fr.sparna.rdf.skos.xls2skos.Xls2SkosConverter;

public class Convert implements CliCommandIfc {

	private Logger log = LoggerFactory.getLogger(this.getClass().getName());
	
	@Override
	public void execute(Object args) throws Exception {
		ArgumentsConvert a = (ArgumentsConvert)args;
		
		// get an input stream on input file
		if(!a.getInput().exists()) {
			log.error("Given input file "+a.getInput().getAbsolutePath()+" does not exist.");
			return;
		}
		
		// if user asked for graph files, but without outputting in a directory or in a zip, this is an error
		if(a.isGenerateGraphFiles() && !(a.getOutput().getName().endsWith("zip") || a.isOutputAsDirectory())) {
			log.error("If you need to generate graph files please use the option to output in a directory, or provide an output file with .zip extension.");
			return;
		}
		
		// determine output format
		RDFFormat theFormat = RDFFormat.RDFXML;
		if(a.getRdfFormat() != null) {
			if(!RDFWriterRegistry.getInstance().getFileFormatForMIMEType(a.getRdfFormat()).isPresent()) {
				log.error("Unknown output format : "+a.getRdfFormat());
				return;
			} else {
				theFormat = RDFWriterRegistry.getInstance().getFileFormatForMIMEType(a.getRdfFormat()).get();
			}
		} else {
			// determine format from file extension
			if(Rio.getWriterFormatForFileName(a.getOutput().getName()).isPresent()) {
				theFormat = Rio.getWriterFormatForFileName(a.getOutput().getName()).get();
			}
		}
		log.debug("Will use output format : "+theFormat.getDefaultMIMEType());
		
		// determine output mode
		boolean useZip = a.getOutput().getName().endsWith("zip");
		ModelWriterFactory factory = new ModelWriterFactory(useZip, theFormat, a.isGenerateGraphFiles());
		
		ModelWriterIfc modelWriter = null;
		FileOutputStream fileStream = null;
		if(a.isOutputAsDirectory()) {
			modelWriter = factory.buildNewModelWriter(a.getOutput());
		} else {
			fileStream = new FileOutputStream(a.getOutput());
			modelWriter = factory.buildNewModelWriter(fileStream);
		}
		
		try(InputStream in = new FileInputStream(a.getInput())) {
			Xls2SkosConverter converter = new Xls2SkosConverter(modelWriter, a.getLang());
			converter.setGenerateXl(a.isXlify());
			converter.setGenerateXlDefinitions(a.isXlifyDefinitions());
			converter.processInputStream(in);
		}
		
		if(fileStream != null) {
			fileStream.flush();
			fileStream.close();
		}
	}
	
}