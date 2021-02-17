package com.henryjiang.aviationinfo.controller;

import com.henryjiang.aviationinfo.model.Plane;
import com.henryjiang.aviationinfo.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@RestController
@RequestMapping("api/plane")
public class PlaneController {

    private PlaneService planeService;

    @Autowired
    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }

    @GetMapping
    public List<Plane> getAllPlanes() {
        return planeService.getAllPlanes();
    }

    @GetMapping("/{attribute}/{name}")
    public List<Plane> getPlanesByAttribute(@PathVariable("attribute") String attribute, @PathVariable("name") String name) {
        return planeService.getPlanesByAttribute(attribute, name);
    }

    @PostMapping
    public String insertPlane(@RequestBody Plane plane) {
        planeService.insertPlane(plane);
        return "Added plane";
    }
}
