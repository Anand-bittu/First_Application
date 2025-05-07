package com.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Dmain {

	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("obj.txt");
			
			ObjectInputStream ostream=new ObjectInputStream(file);
			//read the Student Object
			 Student s1=(Student)ostream.readObject();
			 System.out.println(s1.getName());
			 System.out.println(s1.getSid());
             System.out.println(s1.getAddress());
			
		}catch (Exception e) {
           e.printStackTrace();
		}
	}
}
