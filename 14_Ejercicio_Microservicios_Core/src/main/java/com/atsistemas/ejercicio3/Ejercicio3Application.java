package com.atsistemas.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ejercicio3Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio3Application.class, args);
	}
}
