package com.henryjiang.aviationinfo.controller;


import com.henryjiang.aviationinfo.model.Model;
import com.henryjiang.aviationinfo.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/model")
public class ModelController {

    private ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping
    public List<Model> getAllModels() {
        return modelService.getAllModels();
    }

    @GetMapping("/{attribute}/{name}")
    public List<Model> getModelsByAttribute(@PathVariable("attribute") String attribute, @PathVariable("name") String name) {
        return modelService.getModelsByAttribute(attribute, name);
    }

    @PostMapping
    public String insertModel(@RequestBody Model model) {
        modelService.insertModel(model);
        return "Added model";
    }
}
