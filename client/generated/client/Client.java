package client;

import client.generated.*;
import java.net.URL;
import java.time.LocalDateTime;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {
    public static void main(String[] args) throws Exception {

        URL wsdlUrl = new URL("http://localhost:9090/ConversionService?wsdl");


        QName qname = new QName("http://ws/", "ConversionServiceImplementationService");

        Service service = Service.create(wsdlUrl, qname);

        ConversionService port = service.getPort(ConversionService.class);

        double rate = port.getConversionRate();
        System.out.println(LocalDateTime.now() + " - Conversion Rate: " + rate);

        double euros = 10.0;
        double dollars = port.euroToDollar(euros);
        System.out.println(LocalDateTime.now() + " - " + euros + " EUR = " + dollars + " USD");
    }
}
