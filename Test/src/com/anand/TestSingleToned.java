package com.anand;

public class TestSingleToned {

	private static TestSingleTone sig=null;
	
	private  TestSingleToned() {

	}
	public static TestSingleTone getInstance() {
		if(sig==null) {
			return new TestSingleTone();
		}
		return sig;
	}
	
}
