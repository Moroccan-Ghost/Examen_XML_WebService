import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;
import operationServices.ReleveService;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class generateSchema {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ReleveService.class);
        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String s, String s1) throws IOException {
                File xsdFile = new File("src/XmlPart/relevee.xsd");
                StreamResult rs = new StreamResult(xsdFile);
                rs.setSystemId(xsdFile.getName());
                return rs;
            }
        });



    }
}
