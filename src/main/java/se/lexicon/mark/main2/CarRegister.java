package se.lexicon.mark.main2;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class CarRegister implements Serializable {
    private UUID carID;
    private String regNumber;
    private String brand;
    private String model;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
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
    public CarRegister(){

    }

    public UUID getCarID() {
        return carID;
    }


    public String getRegNumber() {
        return regNumber;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public LocalDate getRegDate() {
        return regDate;
    }


    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "CarRegister{" +
                "carID=" + carID +
                ", regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", regDate=" + regDate +
                ", owner='" + owner + '\'' +
                '}';
    }
}

