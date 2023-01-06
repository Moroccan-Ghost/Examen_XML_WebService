import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import operationServices.Operation;
import operationServices.Operations;
import operationServices.ReleveService;

import java.io.File;
import java.text.ParseException;
import java.util.Date;

public class Serialize {
    public static void main(String[] args) throws JAXBException {
        Operation op1 = new Operation("CREDIT",new Date(),150.5,"CREDIT OP1");
        Operation op2 = new Operation("DEBIT",new Date(),2500.5,"DEBIT OP2");
        Operation op3 = new Operation("CREDIT",new Date(),7000,"CREDIT OP3");
        Operation op4 = new Operation("DEBIT",new Date(),40000.5,"DEBIT OP4");


        Operations operations = new Operations();
        operations.setDateFin(new Date());
        operations.setDateDebut(new Date());
        operations.AddOperations(op1);
        operations.AddOperations(op2);
        operations.AddOperations(op3);
        operations.AddOperations(op4);

        ReleveService releve = new ReleveService("1564245454",new Date(),150000,operations);

        JAXBContext context = JAXBContext.newInstance(ReleveService.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("releve.xml"));


    }
}
