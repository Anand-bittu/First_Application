package com.anand.assigment;

public class SpecialBook extends Book {
    private String specialBook;
    
    public SpecialBook(String title,String author,String iSBN,String specialBook) {
    	super(title, author, iSBN);
    	this.specialBook=specialBook;
    }

	public String getSpecialBook() {
		return specialBook;
	}

	public void setSpecialBook(String specialBook) {
		this.specialBook = specialBook;
	}

	@Override
	public String toString() {
		return "SpecialBook [title="+this.getTitle()+", author=" +this.getAuthor() + ", iSBN=" + this.getiSBN() +", specialBook=" + specialBook + "]";
	}
    
    
    
}
