package com.anand;

public class Student implements Cloneable {
   int sid;
   String sname;
public Student(int sid, String sname) {
	this.sid = sid;
	this.sname = sname;
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
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}
public Student cloningssss()throws CloneNotSupportedException {
	
	Student s1=(Student)clone();
	return s1;
}

   
}
