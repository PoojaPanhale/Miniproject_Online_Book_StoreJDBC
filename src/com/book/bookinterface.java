package com.book;

import java.sql.SQLException;
import java.util.List;

import com.entity.BookInfo;



public interface bookinterface {
	public List<BookInfo>displayinventory() throws ClassNotFoundException, SQLException ;
	public void addbook(BookInfo i) throws SQLException, ClassNotFoundException;
	public void buybook(BookInfo i) throws ClassNotFoundException, SQLException;
}
