package com.anand.assigment;

public class Book {
   private String title;
   private String author;
   private String iSBN;
   private boolean avaiablity;
public Book(String title, String author, String iSBN) {
	this.title = title;
	this.author = author;
	this.iSBN = iSBN;
	this.avaiablity=true;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getiSBN() {
	return iSBN;
}
public void setiSBN(String iSBN) {
	this.iSBN = iSBN;
}
public boolean isAvaiablity() {
	return avaiablity;
}
public void setAvaiablity(boolean avaiablity) {
	this.avaiablity = avaiablity;
}
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", iSBN=" + iSBN +"]";
}
   


}
