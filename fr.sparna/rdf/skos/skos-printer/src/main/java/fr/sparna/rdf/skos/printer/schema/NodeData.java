//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.26 at 10:36:31 AM CET 
//


package fr.sparna.rdf.skos.printer.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The data of a tree node.
 * 
 * <p>Java class for nodeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nodeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.sparna.fr/thesaurus-display}conceptBlock"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodeData", propOrder = {
    "conceptBlock"
})
public class NodeData {

    protected ConceptBlock conceptBlock;

    /**
     * Gets the value of the conceptBlock property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptBlock }
     *     
     */
    public ConceptBlock getConceptBlock() {
        return conceptBlock;
    }

    /**
     * Sets the value of the conceptBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptBlock }
     *     
     */
    public void setConceptBlock(ConceptBlock value) {
        this.conceptBlock = value;
    }

}
