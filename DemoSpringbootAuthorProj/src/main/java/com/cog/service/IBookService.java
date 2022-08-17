package com.cog.service;

import java.util.List;

import com.cog.modal.Book;

public interface IBookService {
	Integer saveBook(Book book);
	public List<Book> getAllBooks();

}
