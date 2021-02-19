package com.henryjiang.aviationinfo.dao;

import com.henryjiang.aviationinfo.model.Plane;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;
import org.springframework.data.mongodb.core.query.Query;

import javax.annotation.Resource;
import java.util.List;

@Component
public class PlaneDaoImpl implements PlaneDao {

    @Resource
    private MongoTemplate mongoTemplate;

    public List<Plane> getAllPlanes() {
        List<Plane> planes = mongoTemplate.findAll(Plane.class);
        return planes;
    }

    public List<Plane> getPlanesByAttribute(String attribute, String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where(attribute).is(name));
        List<Plane> planes = mongoTemplate.find(query, Plane.class);
        return planes;
    }

    public void insertPlane(Plane plane) {
        mongoTemplate.save(plane);
    }
}
