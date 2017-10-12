package com.stl.example.service;

import com.stl.example.model.Example;
import com.stl.example.repository.example.ExampleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {


    private static final Logger logger = LoggerFactory.getLogger(ExampleService.class);

    @Autowired
    private ExampleRepository repository;


    public Example getExample(String exampleId){
        return repository.findById(Example.class, exampleId);
    }

    public Example getExampleById(String exampleId) {
        return repository.getExample(exampleId);
    }

}
