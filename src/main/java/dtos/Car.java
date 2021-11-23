package dtos;


import enums.FuelType;

public class Car {


    private String model;
    private String year;
    private int id;

    public Car(FuelType fuel) {
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
