package com.henryjiang.aviationinfo.dao;

import com.henryjiang.aviationinfo.model.Model;

import java.util.List;

public interface ModelDao {

    List<Model> getAllModels();

    List<Model> getModelsByAttribute(String attribute, String name);

    void insertModel(Model model);

}
