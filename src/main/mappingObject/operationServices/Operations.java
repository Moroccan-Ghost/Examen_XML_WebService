package operationServices;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.Date;
@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {
    @XmlAttribute
    private Date dateDebut;
    @XmlAttribute
    private Date dateFin;
    @XmlElement
    private ArrayList<Operation> operation = new ArrayList<>();
    public Operations(){

    }
    public Operations(Date dateDebut, Date dateFin, ArrayList<Operation> operations) {
        this.setDateDebut(dateDebut);
        this.setDateFin(dateFin);
        this.setOperations(operations);
    }

    private void setOperations(ArrayList<Operation> operations) {
        this.operation = operations;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public ArrayList<Operation> getOperations() {
        return operation;
    }

    public void AddOperations(Operation operations) {
        this.operation.add(operations) ;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", operations=" + operation +
                '}';
    }
}
