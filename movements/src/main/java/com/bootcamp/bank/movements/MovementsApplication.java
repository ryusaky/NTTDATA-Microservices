package com.bootcamp.bank.movements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovementsApplication.class, args);
	}

}
