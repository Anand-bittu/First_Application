package com.anand.p1;

public class Singletone implements Cloneable {
   private  static Singletone sig=null;
   
   private Singletone() {
	   if(sig!=null) {
	   throw new RuntimeException("Object can not be created");
	   }

   }
	public static Singletone getInsSingletone() {
		if(sig==null) {
			System.out.println("inside null if");
		   sig=new Singletone();
		}
		return sig;
	}
	
	public Singletone clone()/*throws CloneNotSupportedException*/ {
		//return (Singletone)super.clone();
		return sig;
	}
	
}
