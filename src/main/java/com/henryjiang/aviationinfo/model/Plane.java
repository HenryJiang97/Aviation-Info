package com.henryjiang.aviationinfo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "planes")
public class Plane{

    // Basic
    @Id
    private String id;
    private String name;
    private String manufacturer;
    private String model;
    private String seats;

    // Dimension
    private String length;
    private String wingspan;
    private String height;

    // Performance
    private String speed;
    private String range;
    private String engine;
    private String thrust;
    private String takeoff;
    private String takeoffWeight;
    private String fuelCapacity;


    public Plane() {}

    public Plane(String id, String name, String manufacturer, String model, String seats, String length, String wingspan, String height, String speed, String range, String engine, String thrust, String takeoff, String takeoffWeight, String fuelCapacity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.seats = seats;
        this.length = length;
        this.wingspan = wingspan;
        this.height = height;
        this.speed = speed;
        this.range = range;
        this.engine = engine;
        this.thrust = thrust;
        this.takeoff = takeoff;
        this.takeoffWeight = takeoffWeight;
        this.fuelCapacity = fuelCapacity;
    }


    public Plane(String id, String name, String manufacturer, String model) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWingspan() {
        return wingspan;
    }

    public void setWingspan(String wingspan) {
        this.wingspan = wingspan;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getThrust() {
        return thrust;
    }

    public void setThrust(String thrust) {
        this.thrust = thrust;
    }

    public String getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }

    public String getTakeoffWeight() {
        return takeoffWeight;
    }

    public void setTakeoffWeight(String takeoffWeight) {
        this.takeoffWeight = takeoffWeight;
    }

    public String getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(String fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
