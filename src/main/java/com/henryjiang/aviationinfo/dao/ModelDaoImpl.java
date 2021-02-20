package com.henryjiang.aviationinfo.dao;

import com.henryjiang.aviationinfo.model.Model;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;

@Component
public class ModelDaoImpl implements ModelDao {

    private Comparator<Model> modelComparator = new Comparator<Model>() {
        @Override
        public int compare(Model o1, Model o2) {
            return o1.getId().compareTo(o2.getId());
        }
    };

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public List<Model> getAllModels() {
        List<Model> models = mongoTemplate.findAll(Model.class);
        models.sort(modelComparator);
        return models;
    }

    @Override
    public List<Model> getModelsByAttribute(String attribute, String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where(attribute).is(name));
        List<Model> models = mongoTemplate.find(query, Model.class);
        models.sort(modelComparator);
        return models;
    }

    @Override
    public void insertModel(Model model) {
        mongoTemplate.save(model);
    }
}
