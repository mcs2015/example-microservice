package com.stl.example.repository.example;

import com.stl.example.model.Example;
import com.stl.example.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


public class ExampleRepositoryImpl implements ExampleRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public Example getExample(String exampleId) {
        Query query = new Query();
        query.addCriteria(Criteria.where(Constants.DELETED).is(false)
                .and(Constants.EXAMPLE_ID).is(exampleId));

            return mongoTemplate.findOne(query, Example.class);
    }
}
