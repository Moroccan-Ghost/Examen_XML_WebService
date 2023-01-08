package soapPart;

import jakarta.xml.bind.JAXBException;

public class Client {
    public static void main(String[] args) throws JAXBException {
        releveWS releve = new releveWS();
        System.out.println(releve.getDebitOperations());
    }
}
