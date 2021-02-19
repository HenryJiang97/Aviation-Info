package com.henryjiang.aviationinfo.controller;

import com.henryjiang.aviationinfo.model.Manufacturer;
import com.henryjiang.aviationinfo.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/manufacturer")
public class ManufacturerController {

    private ManufacturerService manufacturerService;

    @Autowired
    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping
    public List<Manufacturer> getAllManufacturer() {
        return manufacturerService.getAllManufacturer();
    }

    @GetMapping("/{attribute}/{name}")
    public List<Manufacturer> getManufacturerByAttribute(@PathVariable("attribute") String attribute, @PathVariable("name") String name) {
        return manufacturerService.getManufacturerByAttribute(attribute, name);
    }

    @PostMapping
    public String insertManufacturer(@RequestBody Manufacturer manufacturer) {
        manufacturerService.insertManufacturer(manufacturer);
        return "Added manufacturer";
    }

}
