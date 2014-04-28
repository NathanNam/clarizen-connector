
package com.clarizen.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBaseEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBaseEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseEntity" type="{http://clarizen.com/api}BaseEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBaseEntity", propOrder = {
    "baseEntity"
})
public class ArrayOfBaseEntity {

    @XmlElement(name = "BaseEntity", nillable = true)
    protected List<BaseEntity> baseEntity;

    /**
     * Gets the value of the baseEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseEntity }
     * 
     * 
     */
    public List<BaseEntity> getBaseEntity() {
        if (baseEntity == null) {
            baseEntity = new ArrayList<BaseEntity>();
        }
        return this.baseEntity;
    }

}
