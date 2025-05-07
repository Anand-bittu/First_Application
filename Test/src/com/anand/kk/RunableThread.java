package com.anand.kk;

class Employee1 implements Runnable{

	@Override
	public void run() {
       for(int i=0;i<10;i++) {
    	   System.out.println("Employee1--->"+Thread.currentThread().getName()+"->"+
       Thread.currentThread().getId());
       }
	}
}

class Student1 implements Runnable{
	@Override
	public void run() {
		 for(int i=0;i<20;i++) {
	    	   System.out.println("Student1--->"+Thread.currentThread().getName()+"->"+
	       Thread.currentThread().getId());
	}
}
}



public class RunableThread {
  public static void main(String[] args)throws Exception {
	  Employee1 e1=new Employee1();
	  Student1 st1=new Student1();
	  Thread th1=new Thread(e1,"T1");
	  Thread th2=new Thread(st1,"T2");
	  th1.start();
	//  th1.join();
	  th1.sleep(10000);
	  
	  th2.start();
	 
	
}
}
