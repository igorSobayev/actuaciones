package com.dawes;

import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IgorSobayevActuacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(IgorSobayevActuacionesApplication.class, args);
		Persistence.generateSchema("jpa", null);
	}

}
