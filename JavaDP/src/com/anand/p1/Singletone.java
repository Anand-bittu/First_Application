package com.anand.p1;

import java.io.Serializable;

public class Singletone implements Cloneable,Serializable{

	private static Singletone sig;
	private Singletone() {
    //   throw new RuntimeException("You Can't Creat Object of this Singletone class");
	}
	public static Singletone getInstance() {
		if(sig==null) {
		synchronized (Singletone.class) {
			sig=new Singletone();
		}
		}
		return sig;
	}
	public Object readResolve() {
		return sig;
	}
	public Singletone clone()throws CloneNotSupportedException {
		return sig;
	}
	
}
