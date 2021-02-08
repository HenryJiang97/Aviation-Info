package com.henryjiang.aviationinfo.dao;

import com.henryjiang.aviationinfo.model.Plane;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class PlaneDaoImpl implements PlaneDao{

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public List<Plane> getAllPlanes() {
        List<Plane> planes = mongoTemplate.findAll(Plane.class);
        return planes;
    }

    @Override
    public void insertPlane(Plane plane) {
        mongoTemplate.save(plane);
    }
}
