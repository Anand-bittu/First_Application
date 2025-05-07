package com.anand.b1;


public class Student implements Cloneable {
	 int sid;
	   String sname;
	   Address ad;
	public Student(int sid, String sname,Address ad) {
		this.sid = sid;
		this.sname = sname;
		this.ad=ad;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
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

	public Student cloningssss()throws CloneNotSupportedException {
		Student s1=(Student)clone();
		return s1;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", ad=" + ad + "]";
	}
	
}
