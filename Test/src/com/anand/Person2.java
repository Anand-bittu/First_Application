package com.anand;

public abstract class Person2 {
  private String name;
  private int age;
  private String dob;
public Person2(String name, int age, String dob) {
	this.name = name;
	this.age = age;
	this.dob = dob;
}
public  abstract void doEat();
public abstract void doSleep();
@Override
public String toString() {
	return "Person2 [name=" + name + ", age=" + age + ", dob=" + dob + "]";
}

  
  
	
	
	
}
