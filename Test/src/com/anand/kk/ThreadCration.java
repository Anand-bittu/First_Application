package com.anand.kk;

class Employee extends Thread{
	 
	public Employee() {
      System.out.println("inside construct");
	}
	
	public void run() {
		System.out.println("Employee Run Method::"+Thread.currentThread().getName()+"-->"
				+Thread.currentThread().getId());
		
	}
}
class Student extends Thread{
	public Student() {
        System.out.println("inside Construct Student");
	}
	public void run() {
		System.out.println("Student Run Method::"+Thread.currentThread().getName()+"-->"+
	Thread.currentThread().getId());
	}
	
}



public class ThreadCration {

   public static void main(String[] args) {
  Employee e1=new Employee();
  e1.start();
  Student st=new Student();
  st.start();
	//this is Main thread
	System.out.println(Thread.currentThread().getName());
	//Finding number of Thread
	System.out.println(Thread.activeCount());
} 
   
}
