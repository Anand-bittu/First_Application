package com.anand.p1;

import java.util.*;
import java.util.Map.Entry;import java.util.stream.Collector;
import java.util.stream.Collectors;
public class EmployeeMain {
   
	public static void main(String[] args) {
	    Map<Integer,Employee> mp=new HashMap<>();
	    mp.put(1,new Employee(102,"bbb","hyd"));
	    mp.put(2,new Employee(103,"aaa","hyd"));
	    mp.put(3,new Employee(104,"zzz","aaa"));
	    mp.put(4,new Employee(105,"bbb","bbb"));
	    //convert in set
	    Set<Entry<Integer,Employee>> ls=mp.entrySet();
	 List<Map.Entry<Integer,Employee>> result=  
			 ls.stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getAddress).thenComparing(Comparator.comparing(Employee::getSname)))).collect(Collectors.toList());
	   result.forEach(E->System.out.println(E.getValue()));
	    
	}
}
