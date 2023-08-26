package com.gearstore.peakpacker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.gearstore.peakpacker.models")
@EnableJpaRepositories(basePackages = "com.gearstore.peakpacker.repositories")
@ComponentScan(basePackages = {"com.gearstore.peakpacker.security.services"})

public class PeakpackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeakpackerApplication.class, args);
	}

}
