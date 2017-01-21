package com.boa.training.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader{
	public MyClassLoader(ClassLoader parent)
	{
		super(parent);
	}
	
	private Class getClass(String name) throws ClassNotFoundException
	{
		String file=name.replace('.', File.separatorChar)+".class";
		byte b[]=null;
		try {
			b=loadClassFileData(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class clz=defineClass(name, b, 0, b.length);
		resolveClass(clz);
		return clz;
	}

	private byte[] loadClassFileData(String file) throws IOException {
		// TODO Auto-generated method stub
		InputStream inputStream=getClass().getClassLoader().getResourceAsStream(file);
		int size=inputStream.available();
		byte buffer[]=new byte[size];
		DataInputStream dataInputStream=new DataInputStream(inputStream);
		dataInputStream.readFully(buffer);
		inputStream.close();
		return buffer;
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("loading the class "+name);
		if(name.startsWith("com.boa.training.domain")){
			System.out.println("Loading the class through MyClassLoader");
			return getClass(name);
			
		}
		return super.loadClass(name);
	}
		
}