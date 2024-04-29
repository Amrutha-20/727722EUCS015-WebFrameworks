package com.example.day13cw1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day13cw1.model.AmruthaBook;
import com.example.day13cw1.repository.AmruthaAuthorRepository;
import com.example.day13cw1.repository.AmruthaBookRepository;



@Service
public class AmruthaBookService {
    @Autowired
    private AmruthaBookRepository bookRepository;
    @Autowired
    private AmruthaAuthorRepository authorRepository;
    public AmruthaBook saveBook(Long authorId, AmruthaBook book) {
        AmruthaAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public AmruthaBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

