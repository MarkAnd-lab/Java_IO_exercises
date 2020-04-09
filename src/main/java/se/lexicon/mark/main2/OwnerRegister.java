package se.lexicon.mark.main2;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;

public class OwnerRegister implements Serializable {
    private static int counter = 0;

    private int ownerID;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate dateOfBirth;


    public OwnerRegister(String name, LocalDate dateOfBirth) {
        this.ownerID = ++counter;
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }
    public OwnerRegister(){

    }

    public int getOwnerID() {
        return ownerID;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
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
