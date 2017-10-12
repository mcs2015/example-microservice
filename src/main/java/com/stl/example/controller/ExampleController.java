package com.stl.example.controller;

import com.stl.example.model.*;
import com.stl.example.model.Example;
import com.stl.example.service.ExampleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Api(tags = "Example")
@RestController
@RequestMapping("/api/example")
public class ExampleController {

    private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @Autowired
    private ExampleService exampleService;

    @ApiOperation(value="Get Example by Id")
    @RequestMapping(value="/{exampleId}", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Object> getExample(@PathVariable String exampleId){
        Example example = exampleService.getExampleById(exampleId);

        Map resultMap = new HashMap();
        resultMap.put("exampleId", example.getExampleId());
        resultMap.put("message", example.getMessage());

        return resultMap;
    }

}
