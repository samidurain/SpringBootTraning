package com.boa.training.domain;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClassLoaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassLoader myClassLoader=new MyClassLoader(MyClassLoader.class.getClassLoader());
		try {
			Class clz=myClassLoader.loadClass("com.boa.training.domain.Sample");
			Method printMethod=clz.getDeclaredMethod("print");
			printMethod.invoke(clz.newInstance());
			
			Method printCLMethod=clz.getDeclaredMethod("printClassLoader");
			printCLMethod.invoke(null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}