package com.book.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.book.bookinterface;
import com.entity.BookInfo;












public class BookImplementation implements  bookinterface{

	@Override
	public List<BookInfo> displayinventory() throws ClassNotFoundException, SQLException {

		 ArrayList<BookInfo> list = new ArrayList<BookInfo>();
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/capagiminicourse","root","Pooja@123");

		 PreparedStatement statement=con.prepareStatement("select * from Book");
		 ResultSet rs=statement.executeQuery();
		 while(rs.next())
		 {
		 	BookInfo s=new BookInfo();

		 	s.setTitle(rs.getString(1));
		 	s.setAuthor(rs.getString(2));
	        s.setQuantity(rs.getInt(3));
		 	s.setBooktype(rs.getString(4));
		 	s.setPrice(rs.getInt(5));
		 	list.add(s);
		 }
			con.close();
		return list;
	}

	@Override
	public void addbook(BookInfo i) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/capagiminicourse","root","Pooja@123");
       
        PreparedStatement statement=con.prepareStatement("insert into Book values(?,?,?,?,?)");
        statement.setString(1, i.getTitle());
        statement.setString(2, i.getAuthor());
        statement.setInt(3, i.getQuantity());
        statement.setString(4, i.getBooktype());
        statement.setInt(5, i.getPrice());
        statement.executeUpdate();
        con.close();
		
	}

	@Override
	public void buybook(BookInfo i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/capagiminicourse","root","Pooja@123");
       
        PreparedStatement statement=con.prepareStatement("select * from Book where Titel=?,Quantity=?");
        statement.setString(1, i.getTitle());
      //  statement.setString(2, i.getAuthor());
         statement.setInt(2, i.getQuantity());
          //statement.setString(4, i.getBooktype());
         statement.setInt(3, i.getPrice());
       statement.executeQuery();
          con.close();
	
     
        
    }
	}


