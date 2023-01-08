package soapPart;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import operationServices.Operation;
import operationServices.Operations;
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

    public ReleveService releveWS(){
        return this.releve;
    }
    @WebMethod
    public String getRib(){
        return this.releve.getRib();

    }

    @WebMethod
    public double getSolde(){
        return this.releve.getSolde();
    }

    @WebMethod
    public Operations getOperations(){
        return this.releve.getOperations();
    }

    @WebMethod
    public Operations getCreditOperations(){
        Operations ops = new Operations();
        for (Operation operation : this.getOperations().getOperations()){
            if(operation.getType().equals("CREDIT")){
                ops.AddOperations(operation);
            }
        }
        ops.setDateDebut(this.releve.getOperations().getDateDebut());
        ops.setDateFin(this.releve.getOperations().getDateFin());
        return ops;
    }
    @WebMethod
    public Operations getDebitOperations(){
        Operations ops = new Operations();
        for (Operation operation : this.getOperations().getOperations()){
            if(operation.getType().equals("DEBIT")){
                ops.AddOperations(operation);
            }
        }
        ops.setDateDebut(this.releve.getOperations().getDateDebut());
        ops.setDateFin(this.releve.getOperations().getDateFin());
        return ops;
    }

}
