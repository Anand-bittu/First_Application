package com.anand.assigment;

import java.util.ArrayList;
import java.util.List;

public class Member {
  private int menberID;
  private String name;
  private List<Book> borrowedBooks;
public Member(int menberID, String name) {
	this.menberID = menberID;
	this.name = name;
	this.borrowedBooks=new ArrayList<>();
}
public int getMenberID() {
	return menberID;
}
public void setMenberID(int menberID) {
	this.menberID = menberID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Book> getBorrowedBooks() {
	return borrowedBooks;
}
public void borrowedBooks(Book book) {
	borrowedBooks.add(book);
}


@Override
public String toString() {
	return "Member [menberID=" + menberID + ", name=" + name + ", borrowedBooks=" + borrowedBooks + "]";
}

  
	
	
}
