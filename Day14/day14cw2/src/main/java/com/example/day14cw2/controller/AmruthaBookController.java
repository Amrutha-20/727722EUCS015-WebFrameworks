package com.example.day14cw2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14cw2.model.AmruthaBook;
import com.example.day14cw2.service.AmruthaBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class AmruthaBookController {
    @Autowired
    AmruthaBookService bookService;

    @PostMapping("/api/book")
    public AmruthaBook addBook(@RequestBody AmruthaBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public AmruthaBook updateBook(@PathVariable int id,@RequestBody AmruthaBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<AmruthaBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<AmruthaBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
