
package fr.polytechnancy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Conversion", targetNamespace = "http://www.polytechNancy.fr")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Conversion {


    /**
     * 
     * @param mt
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertir", targetNamespace = "http://www.polytechNancy.fr", className = "fr.polytechnancy.Convertir")
    @ResponseWrapper(localName = "convertirResponse", targetNamespace = "http://www.polytechNancy.fr", className = "fr.polytechnancy.ConvertirResponse")
    @Action(input = "http://www.polytechNancy.fr/Conversion/convertirRequest", output = "http://www.polytechNancy.fr/Conversion/convertirResponse")
    public double convertir(
        @WebParam(name = "mt", targetNamespace = "")
        double mt);

}
