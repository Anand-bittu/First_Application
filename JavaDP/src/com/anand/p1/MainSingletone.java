package com.anand.p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class MainSingletone {

	public static void main(String[] args)throws Exception {
		Singletone sig=Singletone.getInstance();
		Singletone sig2=Singletone.getInstance();
		
		/*
		 * System.out.println(sig.hashCode()+"---"+sig2.hashCode()); //breaking the
		 * Singletone By using Clone() of Object class Singletone sig3=sig.clone();
		 * System.out.println(sig3.hashCode()+"------"+sig.hashCode());
		 */
		
		/*
		 * //breaking with reflation API //load The class First Class
		 * loadClass=Class.forName("com.anand.p1.Singletone"); //get Constructor First
		 * Constructor<Singletone> cs=loadClass.getDeclaredConstructor(); //set the
		 * Constructor to public cs.setAccessible(true); //create Instance Method
		 * Singletone sig4=cs.newInstance(); System.out.println();
		 * System.out.println("-------------");
		 * System.out.println(sig4.hashCode()+"----->"+sig.hashCode());
		 */
	
		//serilization and deserlization
		 //first serlization
		  FileOutputStream file=new FileOutputStream("obj.txt");
		  //Object OutputStream
		  ObjectOutputStream obj=new ObjectOutputStream(file);
		  //now serilize the Object
		  obj.writeObject(sig);
		  System.out.println("serlization is done::");
		  //deSerlization 
		  FileInputStream file2=new FileInputStream("obj.txt");
		  ObjectInputStream obj2=new ObjectInputStream(file2);
		  //now deserilzae
		 Singletone sig5=(Singletone)obj2.readObject();
		 System.out.println(sig5.hashCode()+"----->"+sig2.hashCode());
		  
	
	
	}
}
