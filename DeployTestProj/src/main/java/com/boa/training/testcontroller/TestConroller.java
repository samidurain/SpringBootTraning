package com.boa.training.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {

	@GetMapping(value="/", produces="text/html")
		public String getContent() {
			return "<html><body><h2>This is a test </h2></body></html>";
		}
}
