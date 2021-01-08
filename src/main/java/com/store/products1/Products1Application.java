package com.store.products1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.store.products1.data.repository")
@EnableMongoRepositories("com.store.products1.data.repository")
public class Products1Application {

	public static void main(String[] args) {
		SpringApplication.run(Products1Application.class, args);
	}

}
