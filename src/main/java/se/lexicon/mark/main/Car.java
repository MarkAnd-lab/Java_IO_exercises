package se.lexicon.mark.main;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

/* 5.
        In Java create a class called Car with properties like regnumber, brand and
        model etc... The Car class must implement Serializable. To also fulfil the
        contract make a default constructor.
        a.
        Create a List of Cars and add some objects into it.
        b.
        Save the List of Cars to a file using ObjectOutputStream.
        c.
        Read the List of Cars from file using ObjectInputStream.*/

public class Car implements Serializable {
private UUID carID;
private String regNumber;
private String brand;
private String model;
private LocalDate regDate;

//constructor
    public Car(String regNumber, String brand, String model, LocalDate regDate) {
        this.carID = UUID.randomUUID();
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;
    }
    Car(){

    }

    public UUID getCarID() {
        return carID;
    }

    public void setCarID(UUID carID) {
        this.carID = carID;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }


}
