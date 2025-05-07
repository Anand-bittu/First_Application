package com.test;

class Superclass{
	
	public void m1() {
		System.out.println("m1 method of superclass");
		m1();
	}
}

public class TestMain {	
	public static void main(String[] args) {
	    Superclass c1=new Superclass();
	    c1.m1();
	   
	}
}
