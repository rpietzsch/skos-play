package fr.sparna.rdf.skos.helper;

import org.eclipse.rdf4j.model.Resource;
import org.eclipse.rdf4j.query.TupleQueryResultHandlerException;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.impl.SimpleLogger;

import fr.sparna.rdf.rdf4j.toolkit.query.Perform;
import fr.sparna.rdf.rdf4j.toolkit.repository.RepositoryBuilderFactory;
import fr.sparna.rdf.skos.toolkit.GetAlignmentsInSchemeHelper;

public class GetAlignementInSchemeTest {

	@Test
	public void test() {
		System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "DEBUG");
		Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass().getName());
		
		Repository r = RepositoryBuilderFactory.fromString("/fr/sparna/rdf/rdf4j/skos/GetAlignmentsInScheme.ttl").get();
		
		try(RepositoryConnection c = r.getConnection()) {
			Perform.on(c).select(new GetAlignmentsInSchemeHelper() {				
				@Override
				protected void handleAlignment(Resource concept, Resource alignementType, Resource targetConcept)
				throws TupleQueryResultHandlerException {
					log.debug(String.format("Alignement : <%s> <%s> <%s>", concept, alignementType, targetConcept));
				}
			});
		}
	}
	
}
