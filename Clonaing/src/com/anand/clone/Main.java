package com.anand.clone;


public class Main {

	public static void main(String[] args)throws CloneNotSupportedException {	
		/*
		 * Student s1=new Student(101,"Anand","Anand@gmail.com"); //copy of the Student
		 * Student cop=s1.clones();
		 * System.out.println("Before Modification is done............");
		 * System.out.println(s1); System.out.println(cop);
		 * System.out.println("Referance:::"+(s1==cop)); s1.setName("Bittu");
		 * System.out.println("after the modification is done.............");
		 * System.out.println("Orignal Object:::"+s1);
		 * System.out.println("Clone Object::::"+cop);
		 */
		Address ad=new Address("Hyd","TS");
		Student s1=new Student(101,"Anand","Anand@gmail",ad);
		
		//shallow cloning
		   Student copy=s1.clones();
		  System.out.println("Before modification is done........");
		  System.out.println(s1);
		  System.out.println(copy);
		  System.out.println("------------------------------");
		  //now Changing the address Object
		   ad.setCity("Nodia");
		   System.out.println("after Modification is done.......");
		   System.out.println("Original Object:::"+s1);
		   System.out.println("Copy Object:::"+copy);
		   
		  
		
	}
}
