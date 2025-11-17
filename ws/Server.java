package ws;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {

        String url = "http://localhost:9090/ConversionService";
        System.out.println("Publishing service at: " + url);

        Endpoint.publish(url, new ConversionServiceImplementation());

        System.out.println("Service is published. Access WSDL at: " + url + "?wsdl");
    }
}