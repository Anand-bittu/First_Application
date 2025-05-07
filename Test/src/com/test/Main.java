package com.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {	
	public static void main(String[] args) {
		try {
			//create Student Object
			Student s1=new Student(101,"anand","Hyd");
			//FileOutputStream is a class in Java used to 
			//write data to a file as a stream of bytes.
			FileOutputStream file=new FileOutputStream("obj.txt");
			
			//ObjectOutputStream is a class in Java that allows you to write Java objects to an output stream, 
			//converting them into a sequence of bytes that can later
			//be read back and reconstructed into the original object (this process is called serialization)
			ObjectOutputStream obj=new ObjectOutputStream(file);
		
		  //	.writeObject(...): This is a method of the ObjectOutputStream class.
		 //	It takes a Java object as an argument and writes a serialized 
		//	representation of that object to the underlying output stream
			//now serlization
			obj.writeObject(s1);
			
			obj.close();
			file.close();
			System.out.println("Object is Serlized In java");	
			
		}catch (Exception e) {
          e.printStackTrace();
		}
	}
}
