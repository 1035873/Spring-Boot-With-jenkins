package com.jspiders.jenkinspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinSpringAppApplication.class, args);
	}
	@GetMapping("/message")
	public String getMessage() {
		return"Welcome to spring  boot with jenkins";
	}

}
