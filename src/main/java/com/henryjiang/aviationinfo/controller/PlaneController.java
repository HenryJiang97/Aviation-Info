package com.henryjiang.aviationinfo.controller;

import com.henryjiang.aviationinfo.model.Plane;
import com.henryjiang.aviationinfo.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public String insertPlane(@RequestBody Plane plane) {
        planeService.insertPlane(plane);
        return "Added plane";
    }
}
