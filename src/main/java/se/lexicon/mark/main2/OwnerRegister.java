package se.lexicon.mark.main2;

import java.io.Serializable;
import java.time.LocalDate;

public class OwnerRegister implements Serializable {

    private int ownerID;
    private String name;
    private LocalDate dateOfBirth;

    public OwnerRegister(String name, LocalDate dateOfBirth) {
        this.ownerID = ownerID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "OwnerRegister{" +
                "ownerID=" + ownerID +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
