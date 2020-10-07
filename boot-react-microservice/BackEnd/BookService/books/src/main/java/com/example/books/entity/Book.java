package com.example.books.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="books")
public class Book{
    @Column(name = "ID")
    private int id;
    
    
    
    @Column(name = "BOOKNAME")
    private String bookName;
    
    @Id
    @Column(name = "BOOKID")
    private int bookId;
    
    @Column(name = "AUTHOR")
    private String author;


    public Book() {
    }

    public Book(int id, int bookId, String bookName, String author) {
        this.id = id;
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "book [author=" + author + ", bookId=" + bookId + ", bookName=" + bookName + ", id=" + id + "]";
    }

    

    
    
}