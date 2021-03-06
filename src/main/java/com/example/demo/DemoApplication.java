package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")

	public String welcomeTest() {
		return "Welcome to Open Shift";
	}
	
	@GetMapping("/{name}")

	public String welcomeNote(@PathVariable String name) {
		return "Hi" + " " + name + " Application deployed successfully.";
	}

}
