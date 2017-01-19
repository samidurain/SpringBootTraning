package com.boa.training.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class CustomerDAO {
	private DataSource dataSource;

	public CustomerDAO() {
		super();
		// TODO Auto-generated constructor stub
		try {
			Context context=new InitialContext();//for looking up jndi resources
			dataSource=(DataSource)context.lookup("java:comp/env/jdbc/TrainingDB");//java:comp/env is a standard prefix to be before the jndi name
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addCustomer(Customer c)
	{
		
	}
	public void removeCustomer(int id)
	{
		
	}
	public void updateCustomer(int id,Customer c)
	{
		
	}
	
	public Customer findCustomer(int id)
	{
		Customer customer=null;
		try {
			Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("select * from customer_tbl where id=?");
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				customer=new Customer();
				customer.setId(id);
				customer.setName(rs.getString(2));
				customer.setBalance(rs.getDouble(3));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}
}
