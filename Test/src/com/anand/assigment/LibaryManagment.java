package com.anand.assigment;

public class LibaryManagment {

	public static void main(String[] args) {
    //create Libary class
		Libary lb=new Libary();
		
		Book abook=new Book("The Hitchhiker's Guide to the Galaxy","Douglas Adams","978-0345391803");
		SpecialBook sp=new SpecialBook("The Lord of the Rings","J.R.R. Tolkien","978-0618260300","Includes Maps");
		//add books
		lb.addBook(abook);
		//super class variable storing sub class Object
		lb.addBook(sp);
		//add members
		Member amembers1=new Member(101,"rani");
		Member amembers2=new Member(102, "mani");
          lb.addMembers(amembers1);
          lb.addMembers(amembers2);		
          
          
          //lean books
          lb.leandBook(101,"978-0618260300");
          lb.displayAviableBooke();
          
          
		// method to find avaiable books
		lb.displayAviableBooke();
		
		
		
		
	}

}
