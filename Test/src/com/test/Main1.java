package com.test;

import java.util.Arrays;
import java.util.List;

public class Main1 {

	
	public static void main(String[] args) {
		Student1 s1=new Student1(101);
		s1.setSname("Anand"); 
		s1.setEmail("email.com");
		s1.setPhone(1025487l);
		
		Student1 s2=new Student1(102);
		s2.setSname("Bittu");
		s2.setEmail("email.com");
		s2.setPhone(12547l);
		
		List<Student1> ls=Arrays.asList(s1,s2);
		System.out.println(ls);
		
		
	}
}
