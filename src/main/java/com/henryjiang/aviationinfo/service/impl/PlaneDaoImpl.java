package com.henryjiang.aviationinfo.service.impl;

import com.henryjiang.aviationinfo.dao.PlaneDao;
import com.henryjiang.aviationinfo.model.Plane;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;
import org.springframework.data.mongodb.core.query.Query;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;

@Component
public class PlaneDaoImpl implements PlaneDao {

    private Comparator<Plane> planeComparator = new Comparator<Plane>() {
        @Override
        public int compare(Plane o1, Plane o2) {
            return o1.getId().compareTo(o2.getId());
        }
    };

    @Resource
    private MongoTemplate mongoTemplate;

    public List<Plane> getAllPlanes() {
        List<Plane> planes = mongoTemplate.findAll(Plane.class);
        planes.sort(planeComparator);
        return planes;
    }

    public List<Plane> getPlanesByAttribute(String attribute, String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where(attribute).is(name));
        List<Plane> planes = mongoTemplate.find(query, Plane.class);
        planes.sort(planeComparator);
        return planes;
    }

    public void insertPlane(Plane plane) {
        mongoTemplate.save(plane);
    }
}
