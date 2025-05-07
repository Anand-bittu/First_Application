package com.test;

public class Student1 {

	private int sid;
	private String sname;
	private String email;
	private Long  phone;
	public Student1(int sid) {
     this.sid=sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
	
}
