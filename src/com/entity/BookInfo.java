package com.entity;

public class BookInfo {
	 private String title;
     private String author;
     private int  quantity;
     private String booktype;
     private int price;
      
     
     public BookInfo()
     {
    	 
     }


	public BookInfo(String title, String author, int quantity, String booktype, int price) {
		super();
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.booktype = booktype;
		this.price = price;
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


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getBooktype() {
		return booktype;
	}


	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "BookInfo [title=" + title + ", author=" + author + ", quantity=" + quantity + ", booktype=" + booktype
				+ ", price=" + price + "]";
	}



	
}
