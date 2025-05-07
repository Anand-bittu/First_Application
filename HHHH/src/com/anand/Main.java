package com.anand;

public class Main {

	public static void main(String[] args)throws CloneNotSupportedException {
         Student s1=new Student(101, "Anand");
       Student copy=  s1.cloningssss();
       System.out.println("Orignal Object:::"+s1);
		System.out.println("Orignal Object HashCode::"+s1.hashCode());
		System.out.println("Copyed Object::"+copy);
		System.out.println("Copyed Object HashCode::"+copy.hashCode());
         //modification of orignal Object
		   s1.setSname("Rani");
		   
		   System.out.println();
		   
		   System.out.println("Orignal Object:::"+s1);
			System.out.println("Orignal Object HashCode::"+s1.hashCode());
			System.out.println("Copyed Object::"+copy);
			System.out.println("Copyed Object HashCode::"+copy.hashCode());
		   
		
		
		
	}

}
