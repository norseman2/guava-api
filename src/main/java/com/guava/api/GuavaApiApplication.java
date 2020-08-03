package com.guava.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class GuavaApiApplication {

	private static final Logger logger = LoggerFactory.getLogger(GuavaApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GuavaApiApplication.class, args);
		logger.info("Spring Boot guava-api launched");
	}

}
