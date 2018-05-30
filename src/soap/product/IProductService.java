
package soap.product;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IProductService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IProductService {


    /**
     * 
     * @return
     *     returns soap.product.ArrayOfProduct
     */
    @WebMethod(operationName = "GetAllProducts", action = "http://tempuri.org/IProductService/GetAllProducts")
    @WebResult(name = "GetAllProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllProducts", targetNamespace = "http://tempuri.org/", className = "soap.product.GetAllProducts")
    @ResponseWrapper(localName = "GetAllProductsResponse", targetNamespace = "http://tempuri.org/", className = "soap.product.GetAllProductsResponse")
    public ArrayOfProduct getAllProducts();

    /**
     * 
     * @param name
     * @return
     *     returns soap.product.Product
     */
    @WebMethod(operationName = "GetProduct", action = "http://tempuri.org/IProductService/GetProduct")
    @WebResult(name = "GetProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProduct", targetNamespace = "http://tempuri.org/", className = "soap.product.GetProduct")
    @ResponseWrapper(localName = "GetProductResponse", targetNamespace = "http://tempuri.org/", className = "soap.product.GetProductResponse")
    public Product getProduct(
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name);

    /**
     * 
     * @param price
     * @param name
     */
    @WebMethod(operationName = "InsertProduct", action = "http://tempuri.org/IProductService/InsertProduct")
    @RequestWrapper(localName = "InsertProduct", targetNamespace = "http://tempuri.org/", className = "soap.product.InsertProduct")
    @ResponseWrapper(localName = "InsertProductResponse", targetNamespace = "http://tempuri.org/", className = "soap.product.InsertProductResponse")
    public void insertProduct(
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name,
        @WebParam(name = "price", targetNamespace = "http://tempuri.org/")
        Double price);

    /**
     * 
     * @param productName
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "BuyProduct", action = "http://tempuri.org/IProductService/BuyProduct")
    @WebResult(name = "BuyProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BuyProduct", targetNamespace = "http://tempuri.org/", className = "soap.product.BuyProduct")
    @ResponseWrapper(localName = "BuyProductResponse", targetNamespace = "http://tempuri.org/", className = "soap.product.BuyProductResponse")
    public Boolean buyProduct(
        @WebParam(name = "productName", targetNamespace = "http://tempuri.org/")
        String productName,
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

}