package com.anand.assigment;

public class StringManuplication {

	public static void main(String[] args) {
     String words="java is very good person java is";
     //Count the number of words in the sentence.
     String s[]=words.split(" ");
     System.out.println(s.length);
     //Reverse each word in the sentence.
     String output="";
     for(int i=s.length-1;i>=0;i--) {
        output=output+s[i];
        if(i>0) {
        	output=output+" ";
        }   
     }
     System.out.println(output);
     //Replace all occurrences of a specific word with another word (user-defined).
     String occurance="is";
     String replace="rani";
     String ouputResult="";
     for(int i=0;i<s.length;i++) {
    	  String temp=s[i];
    	  if(temp.equals(occurance)) {
    		  ouputResult=ouputResult+replace;
    	  }else {
    	      ouputResult=ouputResult+temp;
    	  }
    	  if(i<s.length-1) {
    		  ouputResult=ouputResult+" ";
    	  }
     }
     System.out.println("Replace values::"+ouputResult);
     
	}

}
