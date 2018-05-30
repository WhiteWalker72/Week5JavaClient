
package soap.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductItem" type="{http://schemas.datacontract.org/2004/07/Week5Service.Domain}ProductItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductItem", namespace = "http://schemas.datacontract.org/2004/07/Week5Service.Domain", propOrder = {
    "productItem"
})
public class ArrayOfProductItem {

    @XmlElement(name = "ProductItem", nillable = true)
    protected List<ProductItem> productItem;

    /**
     * Gets the value of the productItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductItem }
     * 
     * 
     */
    public List<ProductItem> getProductItem() {
        if (productItem == null) {
            productItem = new ArrayList<ProductItem>();
        }
        return this.productItem;
    }

}
