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
 * The label of a concept. Can contain a String or a link.
 * 
 * <p>Java class for label complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="label">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.sparna.fr/thesaurus-display}link"/>
 *         &lt;element ref="{http://www.sparna.fr/thesaurus-display}str"/>
 *         &lt;element ref="{http://www.sparna.fr/thesaurus-display}linkExternal"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "label", propOrder = {
    "link",
    "str",
    "linkExternal"
})
public class Label {

    protected Link link;
    protected StyledString str;
    protected Link linkExternal;

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Link }
     *     
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link }
     *     
     */
    public void setLink(Link value) {
        this.link = value;
    }

    /**
     * Gets the value of the str property.
     * 
     * @return
     *     possible object is
     *     {@link StyledString }
     *     
     */
    public StyledString getStr() {
        return str;
    }

    /**
     * Sets the value of the str property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyledString }
     *     
     */
    public void setStr(StyledString value) {
        this.str = value;
    }

    /**
     * Gets the value of the linkExternal property.
     * 
     * @return
     *     possible object is
     *     {@link Link }
     *     
     */
    public Link getLinkExternal() {
        return linkExternal;
    }

    /**
     * Sets the value of the linkExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link }
     *     
     */
    public void setLinkExternal(Link value) {
        this.linkExternal = value;
    }

}
