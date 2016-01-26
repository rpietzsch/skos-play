//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.26 at 10:36:31 AM CET 
//


package fr.sparna.rdf.skos.printer.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A table representation.
 * 
 * <p>Java class for table complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="table">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tableColumn" type="{http://www.sparna.fr/thesaurus-display}tableColumnType" maxOccurs="unbounded"/>
 *         &lt;element name="tableHeader" type="{http://www.sparna.fr/thesaurus-display}rowType" minOccurs="0"/>
 *         &lt;element name="row" type="{http://www.sparna.fr/thesaurus-display}rowType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="colnum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table", propOrder = {
    "tableColumn",
    "tableHeader",
    "row"
})
public class Table {

    @XmlElement(required = true)
    protected List<TableColumnType> tableColumn;
    protected RowType tableHeader;
    protected List<RowType> row;
    @XmlAttribute(required = true)
    protected int colnum;

    /**
     * Gets the value of the tableColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableColumnType }
     * 
     * 
     */
    public List<TableColumnType> getTableColumn() {
        if (tableColumn == null) {
            tableColumn = new ArrayList<TableColumnType>();
        }
        return this.tableColumn;
    }

    /**
     * Gets the value of the tableHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RowType }
     *     
     */
    public RowType getTableHeader() {
        return tableHeader;
    }

    /**
     * Sets the value of the tableHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowType }
     *     
     */
    public void setTableHeader(RowType value) {
        this.tableHeader = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowType }
     * 
     * 
     */
    public List<RowType> getRow() {
        if (row == null) {
            row = new ArrayList<RowType>();
        }
        return this.row;
    }

    /**
     * Gets the value of the colnum property.
     * 
     */
    public int getColnum() {
        return colnum;
    }

    /**
     * Sets the value of the colnum property.
     * 
     */
    public void setColnum(int value) {
        this.colnum = value;
    }

}
