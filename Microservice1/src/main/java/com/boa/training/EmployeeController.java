package com.boa.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping(value="/{addressId}", produces="application/json")
	public Employee getEmployee(@PathVariable("addressId") int addressId) {
		Employee emp = new Employee(1090, "Arwind", "Accountant");
		String url = "http://localhost:8001/address/" + addressId;
		Address address = restTemplate.getForObject(url, Address.class);
		emp.setAddress(address);
		return emp;		
	}
}
