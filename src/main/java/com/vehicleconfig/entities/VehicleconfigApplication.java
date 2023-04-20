package com.vehicleconfig.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.vehicleconfig.*")
@EntityScan(basePackages="com.vehicleconfig.*")
@EnableJpaRepositories(basePackages="com.vehicleconfig.*")
public class VehicleconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleconfigApplication.class, args);
	}

}
