package com.example.day13cw1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.day13cw1.model.AmruthaBook;
import com.example.day13cw1.service.AmruthaBookService;


@RestController
public class AmruthaBookController {
    @Autowired
    private AmruthaBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<AmruthaBook> getBookById(@PathVariable Long bookId) {
        AmruthaBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
