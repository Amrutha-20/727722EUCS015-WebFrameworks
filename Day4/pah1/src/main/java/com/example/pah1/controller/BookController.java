package com.example.pah1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.pah1.model.Book;
import com.example.pah1.service.BookService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BookController {
    public BookService bookService;
    public BookController(BookService bookService)
    {
        this.bookService=bookService;
    }
    @PostMapping("/api/book")
    public Book postBooks(@RequestBody Book book) {
        bookService.saveBook(book);
        return book;
       
    }
    @GetMapping("/api/book")
    public List<Book> getMethodName() {
        List<Book> list = bookService.getBooks();
        return list;
    }
    @GetMapping("/api/book/{bookId}")
    public Book getMethodName(@PathVariable("bookId") int id) {
        Book b = bookService.getBookById(id);
        return b;
    }
    
    
    
}
