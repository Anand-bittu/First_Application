package com.anand.p1;

public class Box<T> {

	private T addValue;
	
	public void setValue(T addValue) {
		this.addValue=addValue;
	}
	
	public T getValue() {
		return addValue;
	}
}
