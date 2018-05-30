
package soap.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetMoneyResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "getMoneyResult"
})
@XmlRootElement(name = "GetMoneyResponse")
public class GetMoneyResponse {

    @XmlElement(name = "GetMoneyResult")
    protected Double getMoneyResult;

    /**
     * Gets the value of the getMoneyResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGetMoneyResult() {
        return getMoneyResult;
    }

    /**
     * Sets the value of the getMoneyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGetMoneyResult(Double value) {
        this.getMoneyResult = value;
    }

}
