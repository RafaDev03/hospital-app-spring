package com.spring.hospital_app_spring;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HospitalAppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalAppSpringApplication.class, args);
	}

	@GetMapping("/saludar")
	public String saludoYFecha() {
		return "Hello world" + LocalDateTime.now();
	}

}
