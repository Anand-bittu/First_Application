package com.test;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer sid;
    private String name;
    private  String address;
	public Student(Integer sid, String name, String address) {
		this.sid = sid;
		this.name = name;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + "]";
	}
	
    
}
