package com.anand;

 public final class AnandPerson implements Cloneable{

	private final int psid;
	private final String pname;
	private final Address ad;
	public AnandPerson(int psid, String pname, Address ad) {
		this.psid = psid;
		this.pname = pname;
		this.ad = ad;
	}
	public int getPsid() {
		return psid;
	}
	public String getPname() {
		return pname;
	}
	public Address getAd() {
		//return ad;
	   return new Address(ad);
	}
	//deep cloning
	
	public AnandPerson clone()throws CloneNotSupportedException {
		return (AnandPerson)super.clone();
	}
	
	
	
	
	@Override
	public String toString() {
		return "AnandPerson [psid=" + psid + ", pname=" + pname + ", ad=" + ad + "]";
	}
	
	
	
}
