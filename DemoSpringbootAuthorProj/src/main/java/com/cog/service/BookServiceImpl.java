package com.cog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cog.modal.Book;
import com.cog.repository.IBookRepository;

public class BookServiceImpl implements IBookService {
	
	@Autowired
	IBookRepository bookRepo;

	@Override
	public Integer saveBook(Book book) {
		Book bk=bookRepo.save(book);
		return bk.getBookId();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
