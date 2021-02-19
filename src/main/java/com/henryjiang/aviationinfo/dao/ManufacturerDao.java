package com.henryjiang.aviationinfo.dao;

import com.henryjiang.aviationinfo.model.Manufacturer;

import java.util.List;


public interface ManufacturerDao {

    List<Manufacturer> getAllManufacturer();

    List<Manufacturer> getManufacturerByAttribute(String attribute, String name);

    void insertManufacturer(Manufacturer manufacturer);
}
