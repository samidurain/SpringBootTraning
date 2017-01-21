package com.boa.training.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.management.InstanceAlreadyExistsException;

public class SerializeAndDeserializeTest {

	public static void main(String[] args) throws InstanceAlreadyExistsException {
		// TODO Auto-generated method stub
		
		try {
			Company company1=Company.getInstance();
			company1.setName("Bank of America");
			FileOutputStream fout=new FileOutputStream("company.dat");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(company1);
			out.close();
			
			company1.setName("Wipro");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fileInputStream=new FileInputStream("company.dat");
			ObjectInputStream oin=new ObjectInputStream(fileInputStream);
			Company company1=(Company) oin.readObject();
			oin.close();
			
			
			 fileInputStream=new FileInputStream("company.dat");
			 oin=new ObjectInputStream(fileInputStream);
			Company company2=(Company) oin.readObject();
			oin.close();
			
			System.out.println(company1.getName());
			System.out.println(company2.getName());
			System.out.println(company1==company2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

}