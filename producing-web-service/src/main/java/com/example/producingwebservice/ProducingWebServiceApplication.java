package com.example.producingwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProducingWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducingWebServiceApplication.class, args);

	}

	@GetMapping
	public String hello(){
		return "Hello World";
	}

}
