package com.boa.training.lambdas;

interface CustomerFactory1{
	Customer createCustomer();
}
interface CustomerFactory2{
	Customer createCustomer(int id);
}

interface CustomerFactory3{
	Customer createCustomer(int id,String name);
}
interface CustomerFactory4{
	Customer createCustomer(int id,String name,double balance);
}

public class ConstructorRefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerFactory1 factory1=Customer::new;
		CustomerFactory2 factory2=Customer::new;
		CustomerFactory3 factory3=Customer::new;
		CustomerFactory4 factory4=Customer::new;
		Customer customer1=factory1.createCustomer();
		Customer customer2=factory2.createCustomer(1001);
		Customer customer3=factory3.createCustomer(1011, "Arvind");
		Customer customer4=factory4.createCustomer(5001, "Arvind", 60000);
		
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		System.out.println(customer4);
	}

}