package com.stl.example.repository.example;

import com.stl.example.model.Example;
import com.stl.example.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository
        extends BaseRepository<Example, String>, ExampleRepositoryCustom {


}
