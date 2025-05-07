package com.anand.b1;

public class Main {

	
	public static void main(String[] args) {
		Calculation c1=(a,b)->{
			int sum=a+b;
			return sum;
		};
		System.out.println(c1.add(10,20));
		System.out.println(c1.add(99, -52));
	}
}
