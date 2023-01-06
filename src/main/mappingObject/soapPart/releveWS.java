package soapPart;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import operationServices.ReleveService;

import java.io.File;

@WebService(name = "releveWS")
public class releveWS {
    JAXBContext jaxbContext = JAXBContext.newInstance(ReleveService.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    private final ReleveService releve = (ReleveService) unmarshaller.unmarshal(new File("releve.xml"));

    public releveWS() throws JAXBException {
    }
    @WebMethod
    public String getRib(){
        return this.releve.getRib();

    }
}
