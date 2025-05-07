package com.anand.de;

@FunctionalInterface
public interface Aanand {

	public void cal(int a,int b);
	
	public static void m1() {
		System.out.println("m1 static method");
	}
	public static void m2() {
		System.out.println("m2 static Method");
	}
	public static void m1(int a) {
		System.out.println("m1 argument Method");
	}
	public default void dm1() {
		System.out.println("dm1  default method");
	}
	public default void dm2() {
		System.out.println("dm2 default method");
	}
	
	
}
