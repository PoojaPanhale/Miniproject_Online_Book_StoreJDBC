package com.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.Bookservices;


public class Book_Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String s;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("_________________ONLINE_BOOK_STORE__________________");
	      System.out.println("1.Display the inventory");
	      System.out.println("2. Add Book");
	      System.out.println("3. buy book");
	      

	      Bookservices i=new Bookservices();

	   
	      do
	      {
	    	  
	    	  System.out.println("Enter the choice ");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  
	    		    i.displayinventory();
	    		    
	    		  break;
	    	  case 2:
	    		     i.addbook();

	    		
	    		 	 break;
	    		 
	    	  case 3:
	    		  
	    	      i.buybook();

	      		
	     		 
	     		 break;
	    	
	    		  
	    	  }
	    	  System.out.println("do you want to continue");
	    	   s=sc.next();

	       }
		  while(s.equals("yes"));


	}

}



