package com.henryjiang.aviationinfo.service;

import com.henryjiang.aviationinfo.dao.ModelDao;
import com.henryjiang.aviationinfo.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {

    private ModelDao modelDao;

    @Autowired
    public ModelService(ModelDao modelDao) {
        this.modelDao = modelDao;
    }

    public List<Model> getAllModels() {
        return modelDao.getAllModels();
    }

    public List<Model> getModelsByAttribute(String attribute, String name) {
        return modelDao.getModelsByAttribute(attribute, name);
    }

    public void insertModel(Model model) {
        modelDao.insertModel(model);
    }
}
