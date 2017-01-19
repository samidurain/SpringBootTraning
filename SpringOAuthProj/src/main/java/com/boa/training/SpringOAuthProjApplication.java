package com.boa.training;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.boa.training.domain.Employee;
import com.boa.training.repository.EmployeeRepository;

@SpringBootApplication
public class SpringOAuthProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOAuthProjApplication.class, args);
	}
	
	@Bean
	public InitializingBean saveData(EmployeeRepository employeeRepository) {
		return () -> {
			employeeRepository.save(new Employee(1001, "AAA", "Developer", 20000));
			employeeRepository.save(new Employee(1002, "BBB", "Accountant", 80000));
			employeeRepository.save(new Employee(1003, "CCC", "Manager", 10000));
		};
	}
}
