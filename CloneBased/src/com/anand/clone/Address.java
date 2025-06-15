package com.anand.clone;

public class Address implements Cloneable {

	private String city;
	private String state;
	public Address(String city, String state) {
		System.out.println("Address");
		this.city = city;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	  //deepCloing 
	public Address clonning()throws CloneNotSupportedException {
	  Address a1=(Address)clone(); 
	  return a1; 
	  }
	 
	
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
	
}
