package com.boa.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.boa.training.domain.Customer;
import com.boa.training.domain.Employee;

@SpringBootApplication
@ImportResource("beans.xml")
public class SpringImportXmlProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringImportXmlProjApplication.class, args);
	}
	
	@Autowired
	private Customer cust;
	
	@Autowired
	private Employee emp;
	
	@Bean
	public CommandLineRunner run() {
		return (args) -> {
			System.out.println("***************************");
			/*System.out.println("ID " + cust.getId());
			System.out.println("Name " + cust.getName());
			System.out.println("Balance " + cust.getBalance());*/
			System.out.println("EMP#: " + emp.getEmpid());
			System.out.println("EMP#: " + emp.getName());
			System.out.println("***************************");
		};
	}
}
