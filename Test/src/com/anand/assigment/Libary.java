package com.anand.assigment;

import java.util.HashMap;
import java.util.Map;

public class Libary {
   Map<String,Book> book;
   Map<Integer,Member> member;
   
   public Libary() {
	   book=new HashMap();
	   member=new HashMap();   
   }
   //add books
   public void addBook(Book abook) {
	   this.book.put(abook.getiSBN(), abook);
   }
   //add members 
   public void addMembers(Member aMember) {
	   this.member.put(aMember.getMenberID(), aMember);
   }

   //lend book method
   public void leandBook(int memberId,String bookIsbn) {
	   if(member.containsKey(memberId)&&book.containsKey(bookIsbn)) {
		   Book isbookavaiable=book.get(bookIsbn);
		   Member mb=member.get(memberId);
		   if(isbookavaiable.isAvaiablity()) {
			   isbookavaiable.setAvaiablity(false);
			   mb.borrowedBooks(isbookavaiable);
			   System.out.println(mb.getName()+" has Borrowed "+isbookavaiable.getTitle());
			   
		   }else {
			   System.out.println("book tilte::"+isbookavaiable.getTitle()+"is not aviable");
		   }
	   }else {
		   System.out.println("Member does not exists");
	   }

   }
  
   //display available books.
   public void displayAviableBooke() {
	   System.out.println("Aviable Books");
	   for(Book books:book.values()) {
		   if(books.isAvaiablity()) {
			 System.out.println(books);  
		   }
	   }	   
   }
   
   
}
