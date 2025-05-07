package com.anand.p;

import java.util.Iterator;

class BrikesDr{
	
     volatile	int count=0;
	 volatile   int count2=0;
	
	public void countingBrike() {
		synchronized (this) {
			count=count+50;
		}
		count2=count2+50;
	}
}


public class Main {
	public static void main(String[] args)throws Exception {
		BrikesDr b1=new BrikesDr();
		System.out.println("inside main method");
		//thread 1
		Runnable r1= ()->{
				for(int i=0;i<10000;i+=50) {
				    b1.countingBrike();
				}
		};
		//Thread 2
		Runnable r2=()->{
			  for(int i=0;i<15000;i+=50) {
				  b1.countingBrike();
			  }
		};
		//Thread 3
		Runnable r3=()->{
			for(int i=0;i<5000;i+=50) {
				b1.countingBrike();
			}
		};
		
		Thread th1=new Thread(r1);
		Thread th2=new Thread(r2);
		Thread th3=new Thread(r3);
		//start Thread
		th1.start();
		th2.start();
		th3.start();
		
		th1.join();
		th2.join();
		th3.join();
		
		
		System.out.println("Count:::"+b1.count+" Count2::"+b1.count2);
		
		
		
		
		
		
	}
}
