package com.stl.example.model;

import com.stl.example.repository.Dto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "example")
public class Example extends Dto {

    @Id
    private String exampleId;
    private String message;

    public Example() {
    }

    public String getExampleId() {
        return exampleId;
    }

    public void setExampleId(String exampleId) {
        this.exampleId = exampleId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Example{" +
                "exampleId='" + exampleId + '\'' +
                ", message=" + message +
                '}';
    }
}
