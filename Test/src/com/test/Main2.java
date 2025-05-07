package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		String s1="there is a tree tree has leaves leaves are green";
	    String endresult[]=s1.split(" ");
	     List<String> st=new ArrayList<>();
	     for(String ad:endresult) {
	    	 st.add(ad);
	     }
Map<String,Long> endResult=st.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   endResult.entrySet().stream().forEach(x->{
	   if(x.getValue()>1) {
		   System.out.println(x);
	   }
   });
	
	
	
	}
}
