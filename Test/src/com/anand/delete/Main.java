package com.anand.delete;

import java.lang.reflect.Constructor;

public class Main {

	public static void main(String[] args)throws CloneNotSupportedException,Exception {
		System.out.println("..........");
		Singletone s1=Singletone.getInstance();
		Singletone s2=Singletone.getInstance();
		System.out.println(s1.hashCode()+".........."+s2.hashCode());
		
		//reflation API
		//load the class 
		Class c1=Class.forName("com.anand.delete.Singletone");
		//access the Constructer
		Constructor<Singletone> constr=c1.getDeclaredConstructor();
		constr.setAccessible(true);
		  Singletone s3 =(Singletone)constr.newInstance();
		  System.out.println(s3.hashCode()+".........."+s1.hashCode());
		
		
		
		
		/*
		 * //breaking the Singleton Object
		 * 
		 * Singletone s3=(Singletone)s1.clonning();
		 * System.out.println(s3.hashCode()+".........."+s1.hashCode());
		 * 
		 * 
		 */
		
	}
}
