package com.anand.p1;

public class Employee implements Cloneable {

	private int sid;
	private String sname;
	private String address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int sid, String sname, String address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Employee clone()throws CloneNotSupportedException {
	  return (Employee)super.clone();
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}
	
	
	
}
