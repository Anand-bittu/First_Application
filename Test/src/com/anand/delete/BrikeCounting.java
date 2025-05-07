package com.anand.delete;

import java.util.Iterator;

class Brike{
	int bcount;
	int bcount2;
	public void counting() {
		synchronized (this) {
			bcount+=50;
		}
		bcount2+=50;
	       
	}
}
public class BrikeCounting {
      public static void main(String[] args)throws InterruptedException  {
    	  Brike b1=new Brike();
    	  //Person one
    	  Runnable r1=()->{
    		 for(int i=0;i<10000;i+=50) {
    			 b1.counting();
    		 }
    	  };
    	  //Person 2
    	  Runnable r2=()->{
    		  for(int i=0;i<15000;i+=50) {
    			  b1.counting();
    		  }
    	  };
    	  //Person 3
    	  Runnable r3=()->{
    		  for(int i=0;i<5000;i+=50) {
    			  b1.counting();
    		  }
    	  };
    	  Thread t1=new Thread(r1);
    	  Thread t2=new Thread(r2);
    	  Thread t3=new Thread(r3);
    	  t1.start();
    	  t2.start();
    	  t3.start();
    	  
    	  t1.join();
    	  t2.join();
    	  t3.join();
    	  
    	  System.out.println(b1.bcount);
    	  
    	  System.out.println("--------");
    	  
    	  System.out.println(b1.bcount2);

      }
	
}
