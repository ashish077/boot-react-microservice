package com.example.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.books.entity.Book;
import com.example.books.service.BookService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class BookController {
	@Autowired
	BookService bookservice;
	
	
	@GetMapping("/book/{id}")
	public List<Book> booksRead(@PathVariable int id) {
		
		List<Book> book=bookservice.getBooks(id);
		
		System.out.println(book);
		return book;
	}
	
}
