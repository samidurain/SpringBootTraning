package com.boa.training.lambdas;

public class Customer {
	private int customerId;
	private String name;
	private double balance;
	public Customer(int customerId, String name, double balance) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.balance = balance;
	}
	public Customer(int customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}
	public Customer(int customerId) {
		super();
		this.customerId = customerId;
	}
	public Customer() {
		super();
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
