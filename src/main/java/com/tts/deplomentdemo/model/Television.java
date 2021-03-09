package com.tts.deplomentdemo.model;

public class Television {
    private Long id;
    private String resolution;
    private String sizeInInches;
    private String model;
    private String brand;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getSizeInInches() {
        return sizeInInches;
    }

    public void setSizeInInches(String sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Television() {
    }

    public Television(Long id, String resolution, String sizeInInches, String model, String brand) {
        this.id = id;
        this.resolution = resolution;
        this.sizeInInches = sizeInInches;
        this.model = model;
        this.brand = brand;
    }
}
