package com.anand.im;

public final  class Student {
   private Integer pid;
   private String sname;
   public Student(Integer pid,String sname) {
	   this.pid=pid;
	   this.sname=sname;
   }
   public Integer getpid() {
	   return  pid;
   }
   public String getName() {
	   return sname;
   }
@Override
public String toString() {
	return "Student [pid=" + pid + ", sname=" + sname + "]";
}
   
	
}
