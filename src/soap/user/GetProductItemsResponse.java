
package soap.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetProductItemsResult" type="{http://schemas.datacontract.org/2004/07/Week5Service.Domain}ArrayOfProductItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getProductItemsResult"
})
@XmlRootElement(name = "GetProductItemsResponse")
public class GetProductItemsResponse {

    @XmlElementRef(name = "GetProductItemsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductItem> getProductItemsResult;

    /**
     * Gets the value of the getProductItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductItem> getGetProductItemsResult() {
        return getProductItemsResult;
    }

    /**
     * Sets the value of the getProductItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductItem }{@code >}
     *     
     */
    public void setGetProductItemsResult(JAXBElement<ArrayOfProductItem> value) {
        this.getProductItemsResult = value;
    }

}
