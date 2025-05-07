package com.anand.p1;

public class MainClone {

	
	public static void main(String[] args)throws CloneNotSupportedException {
		//1
		Employee e1=new Employee();
		
		Employee e2=e1.clone();
		 
		Employee e3=e1.clone();
		
	//	System.out.println(e1.hashCode()+"-->"+e2.hashCode()+"-->"+e3.hashCode());
		
		System.out.println(e2==e3);
		
	}
}
