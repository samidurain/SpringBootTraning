package com.boa.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@Autowired
	private AddressRepository addressRepository;
	
		@GetMapping(value="/address/{id}",produces="application/json")
		public Address findAddress(@PathVariable("id") int id) {
			return addressRepository.findOne(id);
		}
		
}
