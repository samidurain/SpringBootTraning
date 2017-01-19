package com.boa.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.boa.training","com.test.training"})
//@ComponentScan({"com.boa.training","com.test.training"})
public class FirstSpringBootProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootProjApplication.class, args);
	}
}
