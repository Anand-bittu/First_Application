package com.anand.de;

public class LamdaExpersionMain {

	
	public static void main(String[] args) {
	  ArithamaticOperation op=(i1,i2)->{
		  return i1+i2;
	  };
	  System.out.println(op.add(40,50));
	  
	  Aanand m1=(a1,a2)->{
		 int sum=a1+a2;
		   System.out.println("sum::"+sum);
	  };
	  m1.cal(20,25);
	  
	  
	  
	  
	}
}
