
package client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EuroToDollarResponse_QNAME = new QName("http://ws/", "euroToDollarResponse");
    private final static QName _EuroToDollar_QNAME = new QName("http://ws/", "euroToDollar");
    private final static QName _GetConversionRate_QNAME = new QName("http://ws/", "getConversionRate");
    private final static QName _GetConversionRateResponse_QNAME = new QName("http://ws/", "getConversionRateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EuroToDollarResponse }
     * 
     */
    public EuroToDollarResponse createEuroToDollarResponse() {
        return new EuroToDollarResponse();
    }

    /**
     * Create an instance of {@link EuroToDollar }
     * 
     */
    public EuroToDollar createEuroToDollar() {
        return new EuroToDollar();
    }

    /**
     * Create an instance of {@link GetConversionRate }
     * 
     */
    public GetConversionRate createGetConversionRate() {
        return new GetConversionRate();
    }

    /**
     * Create an instance of {@link GetConversionRateResponse }
     * 
     */
    public GetConversionRateResponse createGetConversionRateResponse() {
        return new GetConversionRateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToDollarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "euroToDollarResponse")
    public JAXBElement<EuroToDollarResponse> createEuroToDollarResponse(EuroToDollarResponse value) {
        return new JAXBElement<EuroToDollarResponse>(_EuroToDollarResponse_QNAME, EuroToDollarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToDollar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "euroToDollar")
    public JAXBElement<EuroToDollar> createEuroToDollar(EuroToDollar value) {
        return new JAXBElement<EuroToDollar>(_EuroToDollar_QNAME, EuroToDollar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConversionRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getConversionRate")
    public JAXBElement<GetConversionRate> createGetConversionRate(GetConversionRate value) {
        return new JAXBElement<GetConversionRate>(_GetConversionRate_QNAME, GetConversionRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConversionRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getConversionRateResponse")
    public JAXBElement<GetConversionRateResponse> createGetConversionRateResponse(GetConversionRateResponse value) {
        return new JAXBElement<GetConversionRateResponse>(_GetConversionRateResponse_QNAME, GetConversionRateResponse.class, null, value);
    }

}
