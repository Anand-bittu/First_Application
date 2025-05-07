package com.anand;

public class Person {
  private String name;
  private int age;
  private String dob;
  private String address;
public Person(String name, int age, String dob, String address) {
	this.name = name;
	this.age = age;
	this.dob = dob;
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", dob=" + dob + ", address=" + address + "]";
}

  
	
	
	
}
