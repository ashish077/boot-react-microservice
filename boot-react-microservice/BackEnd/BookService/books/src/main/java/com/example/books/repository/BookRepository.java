package com.example.books.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.books.entity.*;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
	
	
	@Query("select b from Book b where b.id=:id")
	List<Book> findBookById(int id);
	

}
