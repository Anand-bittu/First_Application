package com.anand;

public class ImutableCLass {

	
	public static void main(String[] args) {
		
		Address ad=new Address("hyd", "ts");
		System.out.println(ad.hashCode());
		Student st=new Student(101,"anand", ad);
		System.out.println("Orignal::"+st);
		
		//imutable break
		/*
		 * Address ad1=st.getAd(); ad1.setCity("Mumbai");
		 * System.out.println("modification::"+st);
		 */
		  Address ad1=st.getAd();
		  ad1.setCity("Mumbai");
	      System.out.println(ad1.hashCode()+"--->"+ad.hashCode());
		System.out.println("Modifiaction::"+st);
		
		
		
	}
}
