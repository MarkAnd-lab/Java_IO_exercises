package se.lexicon.mark.main2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class CarRegister implements Serializable {
    private UUID carID;
    private String regNumber;
    private String brand;
    private String model;
    private LocalDate regDate;
    private String owner;

    public CarRegister(String regNumber, String brand, String model, LocalDate regDate, String owner) {
        this.carID = UUID.randomUUID();
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;
        this.owner = owner;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
