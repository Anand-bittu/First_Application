package com.anand;

public class SingleToneDesign implements Cloneable {

	private static SingleToneDesign sig=null;
	
	private SingleToneDesign() {
		//no one can create Object
		if(sig!=null) {
			throw new RuntimeException("you can not create object at run time");
		}
	}
	
	public static SingleToneDesign getInstSingleToneDesign() {
		if(sig==null) {
			synchronized (SingleToneDesign.class) {
				sig=new SingleToneDesign();
			}	
		}
		return sig;
	}
	
	//for cloning Object
	public SingleToneDesign clone()throws CloneNotSupportedException {
		return sig;
	}
	
	
}
