package com.anand.mul;

interface Car{
	abstract void  drive();
}
interface PetrolCar extends  Car{
	abstract void dive();
}

interface DesialCar extends Car{
	abstract void drive();
}
public class Main implements PetrolCar,DesialCar {

	
	public static void main(String[] args) {
		Main m1=new Main();
		m1.dive();
	}

	@Override
	public void drive() {
		System.out.println("-------");
		System.out.println(this.getClass().getName());
	}

	@Override
	public void dive() {
		System.out.println("****************");
		System.out.println(this.getClass().getName());
	}
}
