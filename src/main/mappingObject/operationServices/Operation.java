package operationServices;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.Date;
@XmlAccessorType(XmlAccessType.FIELD)

public class Operation {
    @XmlElement
    private String type;
    @XmlElement
    private Date date;
    @XmlElement
    private double montant;
    @XmlElement
    private String description;
    public Operation(){

    }
    public Operation(String type, Date date, double montant, String description) {
        this.setType(type);
        this.setDate(date);
        this.setMontant(montant);
        this.setDescription(description);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type='" + type + '\'' +
                ", date=" + date +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                '}';
    }
}
