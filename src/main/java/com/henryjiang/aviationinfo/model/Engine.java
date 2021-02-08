package com.henryjiang.aviationinfo.model;

import java.util.UUID;

public class Engine {

    private UUID id;
    private String name;

    public Engine(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
