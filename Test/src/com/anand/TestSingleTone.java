package com.anand;

import java.lang.reflect.Constructor;

public class TestSingleTone {

	public static void main(String[] args)throws Exception {
       //create object of Single tone class
		/*
		 * SingleToneDesign sg=SingleToneDesign.getInstSingleToneDesign();
		 * System.out.println(sg.hashCode()); SingleToneDesign
		 * sg2=SingleToneDesign.getInstSingleToneDesign();
		 * System.out.println(sg2.hashCode());
		 * 
		 * System.out.println(sg==sg2);
		 */
		  //by clone method
		
			/*
			 * SingleToneDesign sg=SingleToneDesign.getInstSingleToneDesign();
			 * SingleToneDesign sg2=sg.clone();
			 * System.out.println(sg.hashCode()+"---->"+sg2.hashCode());
			 * System.out.println(sg==sg2);
			 */
		
		//by refaltionApi
		/*
		 * SingleToneDesign s=SingleToneDesign.getInstSingleToneDesign(); Class c1=
		 * Class.forName("com.anand.SingleToneDesign"); //get constructor
		 * Constructor<SingleToneDesign> sgs= c1.getDeclaredConstructor(); //set
		 * construea as public sgs.setAccessible(true); SingleToneDesign
		 * s2=(SingleToneDesign)sgs.newInstance();
		 * System.out.println(s.hashCode()+"----->"+s2.hashCode());
		 */
		    
		
		
		
		
	}

}
