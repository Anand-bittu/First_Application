package com.anand;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
public class Rougs {
	
	
	
	public static void main(String[] args) { 	
	   String input="zam,anand,rani,bittu,anand,rani,anand,zam";
	   String temp[]=input.split(",");
	 //  System.out.println(temp);
	   Map<String,Integer> mp=new HashMap<>();
	    for(int i=0;i<temp.length;i++) {
	    	if(mp.containsKey(temp[i])) {
	    		int pos=1;
	    		mp.put(temp[i],mp.get(temp[i])+1);
	    		
	    	}else {
	    		mp.put(temp[i],1);
	    	}
	    }
	    System.out.println(mp);
	    //sort them based in decending Order
	    Set<Entry<String,Integer>> set=mp.entrySet();
	   List<Entry<String,Integer>> v= set.stream().sorted(Entry.comparingByKey(Comparator.reverseOrder())).toList();
	    System.out.println(v);
		
	}
}
