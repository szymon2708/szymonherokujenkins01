package com.example.szymonjenkinsheroku01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Szymonjenkinsheroku01Application {

	public static void main(String[] args) {
		SpringApplication.run(Szymonjenkinsheroku01Application.class, args);
	}

	@GetMapping
	public String get() {
		return "hello jenkins";
	}
}
