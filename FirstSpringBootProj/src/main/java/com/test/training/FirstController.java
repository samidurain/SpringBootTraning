package com.test.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@GetMapping("/")
	public String getMessage() {
		return "<h2> Hello Spring Boot </h2>";
	}
}
