package com.boa.training.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class RestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HttpAuthenticationFeature authenticationFeature=HttpAuthenticationFeature.basic("user1001", "pass1001");
		Client client=ClientBuilder.newClient();
		client.register(authenticationFeature);
		WebTarget target=client.target("http://localhost:8080/api");
	System.out.println(target.request().accept(MediaType.APPLICATION_XML).get(String.class));
	
	GenericType<List<Employee>> genericType=new GenericType<List<Employee>>(){};
	
	List<Employee> employees=target.request().accept(MediaType.APPLICATION_XML).get(genericType);
	for(Employee employee:employees){
		System.out.println(employee.getEmpId()+"\t"+employee.getName()+"\t"+employee.getDesignation()+
				"\t"+employee.getSalary());
	}
	
	
				

	}

}