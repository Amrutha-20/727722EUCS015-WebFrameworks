package com.example.day13cw1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day13cw1.model.AmruthaAuthor;
import com.example.day13cw1.model.AmruthaBook;
import com.example.day13cw1.service.AmruthaAuthorService;
import com.example.day13cw1.service.AmruthaBookService;



@RestController
public class AmruthaAuthorController {
    @Autowired
    private AmruthaAuthorService authorService;
    @Autowired
    private AmruthaBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<AmruthaAuthor> createAuthor(@RequestBody AmruthaAuthor author) {
        AmruthaAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<AmruthaBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody AmruthaBook book) {
        AmruthaBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<AmruthaAuthor> getAuthorById(@PathVariable Long authorId) {
        AmruthaAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<AmruthaAuthor>> getAllAuthors() {
        List<AmruthaAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<AmruthaAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody AmruthaAuthor author) {
        AmruthaAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
