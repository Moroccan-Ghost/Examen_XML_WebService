import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import operationServices.Operation;
import operationServices.ReleveService;

import java.io.File;
import java.util.ArrayList;

public class deserialize {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ReleveService.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        ReleveService releve = (ReleveService) unmarshaller.unmarshal(new File("releve.xml"));

        /*Result Mapping is handled in toString ReleveService :)*/
        releve.toString();
    }
}
