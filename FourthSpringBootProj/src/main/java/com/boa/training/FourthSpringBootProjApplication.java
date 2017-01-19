package com.boa.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.boa.training.domain.MyAppProperties;

@SpringBootApplication
public class FourthSpringBootProjApplication {

	@Autowired
	private MyAppProperties myAppProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(FourthSpringBootProjApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			System.out.println("IP Address: " + myAppProperties.getIp());
			System.out.println("IP Address: " + myAppProperties.getHostname());
			System.out.println("IP Address: " + myAppProperties.getLocation());
		};
	}
	
}
