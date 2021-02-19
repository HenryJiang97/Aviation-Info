package com.henryjiang.aviationinfo.service;

import com.henryjiang.aviationinfo.dao.ManufacturerDao;
import com.henryjiang.aviationinfo.model.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {

    private ManufacturerDao manufacturerDao;

    @Autowired
    public ManufacturerService(ManufacturerDao manufacturerDao) {
        this.manufacturerDao = manufacturerDao;
    }

    public List<Manufacturer> getAllManufacturer() {
        return manufacturerDao.getAllManufacturer();
    }

    public List<Manufacturer> getManufacturerByAttribute(String attribute, String name) {
        return manufacturerDao.getManufacturerByAttribute(attribute, name);
    }

    public void insertManufacturer(Manufacturer manufacturer) {
        manufacturerDao.insertManufacturer(manufacturer);
    }
}
