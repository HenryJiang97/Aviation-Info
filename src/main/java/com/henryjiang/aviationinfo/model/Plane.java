package com.henryjiang.aviationinfo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "planes")
public class Plane{

    @Id
    private String id;
    private String name;
    private String manufacturer;
//    private Dimension dimension;
//    private Engine engine;


    public Plane() {}

    public Plane(String id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
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
}
