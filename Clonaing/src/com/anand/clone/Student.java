package com.anand.clone;


public class Student implements Cloneable{

	private Integer id;

	private String name;
	
	private String email;
	
	private Address address;
	
	public Student(Integer id, String name, String email,Address ad) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address=ad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	//Shallow Cloning
	public Student clones()throws CloneNotSupportedException {
	    Student s1=(Student)clone();
	      return s1;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	


	
	
}
