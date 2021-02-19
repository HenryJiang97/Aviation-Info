package com.henryjiang.aviationinfo.dao;

import com.henryjiang.aviationinfo.model.Manufacturer;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ManufacturerDaoImpl implements ManufacturerDao {

    @Resource
    private MongoTemplate mongoTemplate;

    public List<Manufacturer> getAllManufacturer() {
        List<Manufacturer> manufacturers = mongoTemplate.findAll(Manufacturer.class);
        return manufacturers;
    }

    public List<Manufacturer> getManufacturerByAttribute(String attribute, String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where(attribute).is(name));
        List<Manufacturer> manufacturers = mongoTemplate.find(query, Manufacturer.class);
        return manufacturers;
    }

    public void insertManufacturer(Manufacturer manufacturer) {
        mongoTemplate.save(manufacturer);
    }
}
