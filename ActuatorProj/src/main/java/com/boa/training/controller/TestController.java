package com.boa.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value="/", produces="text/html")
	public String getMessage() {
		return "<h2> Actuator Module </h2>";
	}
}
