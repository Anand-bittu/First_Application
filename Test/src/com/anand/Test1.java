package com.anand;

import java.util.Optional;

public class Test1 {
	
	
	
	
	public void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		try {
		Test1 t1=null;
		 t1.m2();
		}catch (Exception e) {
             System.out.println("Error");
		}
		 System.out.println("After null exception logic");
		// System.out.println(value.length());
		 System.out.println("--------------");
		String v="Rani";
		Optional<String> name=Optional.of(v);
		System.out.println(name);
		System.out.println("logic after null pointer Exception");
		System.out.println("-----------");
		String value="Anand";
		Optional<String> op=Optional.ofNullable(value);
		op.ifPresent(r->System.out.println(r+" Hi how are you"));
		
		boolean falg=true;
		if(!falg) {
			System.out.println("So true become false ");
		}else {
			System.out.println("true Condtion");
		}
		
		
		
		
		
		
	}
	
	

}
