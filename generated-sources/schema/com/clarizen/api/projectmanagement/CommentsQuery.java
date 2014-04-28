
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.EntityId;
import com.clarizen.api.queries.BuiltInQuery;


/**
 * <p>Java class for CommentsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentsQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}BuiltInQuery">
 *       &lt;sequence>
 *         &lt;element name="AttachedToId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="CommentType" type="{http://clarizen.com/api/projectManagement}CommentType" minOccurs="0"/>
 *         &lt;element name="Visibility" type="{http://clarizen.com/api/projectManagement}CommentVisibility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentsQuery", propOrder = {
    "attachedToId",
    "commentType",
    "visibility"
})
public class CommentsQuery
    extends BuiltInQuery
{

    @XmlElement(name = "AttachedToId", nillable = true)
    protected EntityId attachedToId;
    @XmlElement(name = "CommentType")
    protected CommentType commentType;
    @XmlElement(name = "Visibility")
    protected CommentVisibility visibility;

    /**
     * Gets the value of the attachedToId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getAttachedToId() {
        return attachedToId;
    }

    /**
     * Sets the value of the attachedToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setAttachedToId(EntityId value) {
        this.attachedToId = value;
    }

    /**
     * Gets the value of the commentType property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getCommentType() {
        return commentType;
    }

    /**
     * Sets the value of the commentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setCommentType(CommentType value) {
        this.commentType = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link CommentVisibility }
     *     
     */
    public CommentVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentVisibility }
     *     
     */
    public void setVisibility(CommentVisibility value) {
        this.visibility = value;
    }

}
