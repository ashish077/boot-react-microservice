package com.example.books.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.books.entity.Book;
import com.example.books.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {
	
	
	@Autowired
	BookRepository bookReps;
	

	@Override
	public List<Book> getBooks(int id) {
		
		
		return bookReps.findBookById(id);
		
		
	}

}
