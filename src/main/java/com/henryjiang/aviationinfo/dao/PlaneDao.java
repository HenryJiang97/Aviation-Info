package com.henryjiang.aviationinfo.dao;

import com.henryjiang.aviationinfo.model.Plane;

import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public interface PlaneDao {

    List<Plane> getAllPlanes();

    List<Plane> getPlanesByAttribute(String attribute, String name);

    void insertPlane(Plane plane);
}
