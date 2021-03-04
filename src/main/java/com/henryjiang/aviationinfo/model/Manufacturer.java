package com.henryjiang.aviationinfo.model;


public class Manufacturer {

    private String id;
    private String name;
    private String bioLink;

    public Manufacturer(String id, String name, String bioLink) {
        this.id = id;
        this.name = name;
        this.bioLink = bioLink;
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

    public String getBio() {
        return bioLink;
    }

    public void setBio(String bioLink) {
        this.bioLink = bioLink;
    }
}
