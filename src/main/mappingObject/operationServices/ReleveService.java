package operationServices;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement(name = "releve")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReleveService {
    @XmlAttribute
    private String rib;
    @XmlElement
    private Date dateReleve;
    @XmlElement
    private double solde;
    @XmlElement
    private Operations operations;

    public ReleveService() {

    }

    public ReleveService(String rib, Date dateReleve, double solde, Operations operations) {
        this.setRib(rib);
        this.setDateReleve(dateReleve);
        this.setSolde(solde);
        this.setOperations(operations);
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    public String toString() {
        System.out.println("Releve{" +
                "rib='" + rib + '\'' +
                ", dateReleve=" + dateReleve +
                ", solde=" + solde + "}"
        );
        System.out.println("Operations : ");
        for (Operation op : this.getOperations().getOperations()) {
            System.out.println(op.toString());
        }
        return null;
    }
}
