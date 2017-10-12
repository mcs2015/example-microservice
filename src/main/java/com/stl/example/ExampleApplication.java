package com.stl.example;

import com.stl.example.repository.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@EnableMongoRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
public class ExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExampleApplication.class, args);
	}

}
