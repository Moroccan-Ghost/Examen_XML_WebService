package soapPart;

import jakarta.xml.bind.JAXBException;
import jakarta.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) throws JAXBException {
        Endpoint.publish("http://localhost:9191/", new releveWS());
        System.out.println("Web Service Started at http://localhost:9191/ ! ");
    }
}
