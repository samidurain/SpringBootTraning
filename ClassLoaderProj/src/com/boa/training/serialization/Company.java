package com.boa.training.serialization;

import java.io.Serializable;

import javax.management.InstanceAlreadyExistsException;

/**
 * Singleton class
 * @author CSS
 *
 */
public class Company implements Serializable{
	private static Company instance;
	
	private String name;
	
	private Company() throws InstanceAlreadyExistsException {
		if(instance != null) {
			throw new InstanceAlreadyExistsException("Singleton -- Can't instantiate more than one");
		}			
	}
	
	public static Company getInstance() throws InstanceAlreadyExistsException {
		if(instance == null) {
			synchronized (Company.class) {
				if(instance == null)
					instance = new Company();
			}
		}
		return instance;		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	//To avoid creation of multiple objs from file
	private Object readResolve() {
		System.out.println("Read Resolve Method");
		instance.setName(getName());
		return instance;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
