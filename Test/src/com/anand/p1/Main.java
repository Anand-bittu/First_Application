package com.anand.p1;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	
	public static void main(String[] args)throws CloneNotSupportedException,Exception{
		Singletone sg=Singletone.getInsSingletone();
		Singletone sg2=Singletone.getInsSingletone();
		Singletone sg3=Singletone.getInsSingletone();
		Singletone sg4=Singletone.getInsSingletone();
		System.out.println(sg==sg2);
		System.out.println(sg3==sg4);
		
		//clone based  break
		Singletone sg5=sg.clone();
		System.out.println(sg5==sg);
		
		//ReflactionAPI
	//load the class First
	/*
	 * Class cl=Class.forName("com.anand.p1.Singletone"); //after load access
	 * Constructor Constructor<Singletone> cs=cl.getDeclaredConstructor(); //set
	 * Constructor cs.setAccessible(true); Singletone
	 * sg6=(Singletone)cs.newInstance(); //Now Check HashCode
	 * System.out.println(sg6==sg);
	 */
	/*
	 * Class cl=Class.forName("com.anand.p1.Singletone"); Constructor<Singletone>
	 * cs=cl.getDeclaredConstructor(); //set Constructot cs.setAccessible(true);
	 * Singletone sg7=(Singletone) cs.newInstance(); System.out.println(sg7==sg);
	 */
		
		System.out.println("------------------------");
		List<List<Integer>> values=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6)
				,Arrays.asList(7,8,9));
		
		//ouput(1,2,3,4,5,6,7,8,9)
	  List<Integer> res=	values.stream().flatMap(n->n.stream()).collect(Collectors.toList());
		System.out.println(res);		
		
		System.out.println("---------------------------------------");
		System.out.println("Refalation API");
		
		   //first Load the class
		  Class cs=Class.forName("com.anand.p1.Student");
		  
		  //Get the variable
		 Field filed= cs.getDeclaredField("age");
		 
		 //set the filed 
		 filed.setAccessible(true);
		 //getting object of  load class
		 Object obj=cs.newInstance();
		 
		 Student s=(Student)obj;
		 //set value to private varible
		 filed.set(obj,90);
		System.out.println(s.getAge());
		 System.out.println("Hello world");
		  
		
		
		
		
		
		
		
		
	}
}
