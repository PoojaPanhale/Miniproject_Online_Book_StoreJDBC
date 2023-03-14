package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.book.impl.BookImplementation;
import com.entity.BookInfo;












public class Bookservices {
	public List<BookInfo> displayinventory() throws ClassNotFoundException, SQLException 
	{
		List<BookInfo>list=new BookImplementation().displayinventory();
		for(BookInfo i:list)
		{
			System.out.println(i);
		}
		return list;
				
	}

public void addbook() throws ClassNotFoundException, SQLException
{
	List<BookInfo>list=new BookImplementation().displayinventory();
	 Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the Book's title:");
       String title = scanner.nextLine();
       System.out.println("Enter the author's name:");
       String author = scanner.nextLine();
       System.out.println("Enter the Quantity of the book:");
       int quantity = scanner.nextInt();
       System.out.println("Enter the Book's Booktype:");
       String booktype = scanner.nextLine();
       System.out.println("Enter the Price:");
       int price = scanner.nextInt();
       BookInfo newBook = new BookInfo(title, author, quantity,booktype,price);
       list.add(newBook);
       System.out.println("The book has been added to the inventory.");
   }
	

public void buybook() throws ClassNotFoundException, SQLException
{
	List<BookInfo>list=new BookImplementation().displayinventory();
	   Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the title of the book you want to buy:");
       String title = scanner.nextLine();
       for (BookInfo book : list) {
           if (book.getTitle().equalsIgnoreCase(title)) {
               System.out.println("The price of the book is: $" + book.getPrice());
               System.out.println("Enter the quantity you want to buy:");
               int quantity = scanner.nextInt();
               if (quantity > book.getQuantity()) {
                   System.out.println("Sorry, there are not enough copies of the book in stock.");
                   return;
               }
               double totalPrice = quantity * book.getPrice();
               System.out.println("The total cost of your purchase is: $" + totalPrice);
               book.setQuantity(book.getQuantity() - quantity);
               System.out.println("____________________________Thank you for your purchase__________________________");
               return;
           }
       }
       System.out.println("Sorry, the book you are looking for is not in our inventory.");
   }


 
	

}

