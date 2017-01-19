package com.boa.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.training.domain.Employee;

@Configuration
public class MyConfig {
	
	@Bean
	public Employee createEmployee() {
		return new Employee(501,"Akilesh");
	}

}
