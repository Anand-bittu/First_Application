package com.anand.clone;

public class Main {

	
	public static void main(String[] args)throws CloneNotSupportedException{
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
		/*
		 * 
		 * System.out.println("ShallowCopy"); Address ad=new Address("Hyd", "TS");
		 * Student s1=new Student(101,"Anand","Anand@gmail", ad);
		 * System.out.println("HashCode of address Before Cloning Object::"+ad.hashCode(
		 * )); Student cop=s1.clones();
		 * System.out.println("Before Modification is Done........");
		 * System.out.println("Orignal Object::"+s1);
		 * System.out.println("Copyed Object:::"+cop);
		 * System.out.println("HashCode Of Address after cloning Object::"+cop.
		 * getAddress().hashCode()); System.out.println();
		 * System.out.println("------------------------"); //Instance variable
		 * modification s1.setName("Bittu"); System.out.println("Orginal Object::"+s1);
		 * System.out.println("Copyed Object::"+cop); System.out.println();
		 * System.out.println("--------------------"); //Reference Variable Modification
		 * Address a2=s1.getAddress(); a2.setState("mumbai");
		 * System.out.println("Orignal Object::"+s1);
		 * System.out.println("Copyed Object::"+cop);
		 * 
		 */
		
		  System.out.println("DeepCopy............"); 
          Address ad=new Address("Hyd", "TS"); 
          Student s1=new Student(101,"Anand","Anand@gmail", ad);
		  System.out.println("HashCode of address Before Cloning Object::"+ad.hashCode());
		  System.out.println();
		  Student cop=s1.clones();
		  System.out.println("Before Modification is Done........");
		  System.out.println("Orignal Object::"+s1);
		  System.out.println("Copyed Object:::"+cop);
		  System.out.println("HashCode Of Address after cloning Object::"+cop.getAddress().hashCode()); 
		  System.out.println();
		  System.out.println("------------------------"); 
		  //Instance variable modification 
		  s1.setName("Bittu");
		  System.out.println("Orginal Object::"+s1);
		  System.out.println("Copyed Object::"+cop); 
		  System.out.println();
		  System.out.println("--------------------"); 
		  //Reference Variable Modification
		   Address a2=s1.getAddress();
		   a2.setState("mumbai");
		  System.out.println("Orignal Object::"+s1);
		  System.out.println("Copyed Object::"+cop);
                   System.out.println("Raj");
	}
}
