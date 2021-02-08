package com.henryjiang.aviationinfo.service;

import com.henryjiang.aviationinfo.dao.PlaneDao;
import com.henryjiang.aviationinfo.model.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneService {

    private PlaneDao planeDao;

    @Autowired
    public PlaneService(PlaneDao planeDao) {
        this.planeDao = planeDao;
    }

    public List<Plane> getAllPlanes() {
        return planeDao.getAllPlanes();
    }

    public void insertPlane(Plane plane) {
        planeDao.insertPlane(plane);
    }
}
