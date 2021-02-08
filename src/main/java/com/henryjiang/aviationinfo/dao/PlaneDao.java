package com.henryjiang.aviationinfo.dao;

import com.henryjiang.aviationinfo.model.Plane;

import java.util.List;

public interface PlaneDao {

    List<Plane> getAllPlanes();

    void insertPlane(Plane plane);
}
