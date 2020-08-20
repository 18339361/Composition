package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupple;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupple, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupple = powerSupple;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Poer button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupple() {
        return powerSupple;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
