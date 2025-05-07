package com.anand.delete;

public class Singletone implements Cloneable{

	private static Singletone sig;
	private Singletone() {
         throw new RuntimeException("Can not Create Singletone Object");
	}
	public static Singletone getInstance() {
		if(sig==null) {
			synchronized (Singletone.class) {
				sig=new Singletone();
			}
			return sig;
		}	
	return sig;
	}
	
	public Object clonning()throws CloneNotSupportedException {
		//return super.clone();
		return sig;
	}
	
}
