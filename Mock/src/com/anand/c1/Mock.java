package com.anand.c1;

interface I1{
	int a=10;
	void m1();
}
interface I2{
	int a=20;
	void m1();
}
interface I3{
	int a=30;
	void m1();
}
public class Mock implements I1,I2,I3{
	public static void main(String[] args) {
	   //System.out.println(a);
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
