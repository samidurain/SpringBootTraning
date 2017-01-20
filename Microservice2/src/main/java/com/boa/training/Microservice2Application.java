package com.boa.training;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Microservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
	}
	
	@Bean
	public InitializingBean addRecords(AddressRepository addressReository) {
		return () -> {
			addressReository.save(new Address(1001, "Velachert", "Chennai"));
			addressReository.save(new Address(1002, "Kachuguda", "Hydrabad"));
			addressReository.save(new Address(1003, "Jeya Nagar", "Bangaluru"));
		};
		
	}
}
