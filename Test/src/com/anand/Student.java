package com.anand;

final public  class Student {

	private final  int sid;
	private final String sname;
	private final Address ad;
	public Student(int sid, String sname, Address ad) {
		this.sid = sid;
		this.sname = sname;
		this.ad =ad;
	}
	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public Address getAd() {
		//apply clone deep Clone her its best practies
		return  new Address(ad);
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", ad=" + ad + "]";
	}
	
}
