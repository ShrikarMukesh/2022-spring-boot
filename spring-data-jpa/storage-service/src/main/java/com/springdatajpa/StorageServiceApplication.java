package com.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.springdatajpa.model"})
public class StorageServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(StorageServiceApplication.class, args);
	}
}
