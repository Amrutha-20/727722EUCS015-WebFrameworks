package com.example.day13cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day13cw1.model.AmruthaAuthor;
import com.example.day13cw1.repository.AmruthaAuthorRepository;



@Service
public class AmruthaAuthorService {
    @Autowired
    private AmruthaAuthorRepository authorRepository;

    public AmruthaAuthor saveAuthor(AmruthaAuthor author) {
        return authorRepository.save(author);
    }

    public AmruthaAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<AmruthaAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public AmruthaAuthor updateAuthor(Long id, AmruthaAuthor author) {
        AmruthaAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
