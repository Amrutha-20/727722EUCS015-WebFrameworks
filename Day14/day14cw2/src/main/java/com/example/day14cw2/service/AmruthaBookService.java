package com.example.day14cw2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14cw2.model.AmruthaBook;
import com.example.day14cw2.repository.AmruthaBookRepo;

@Service
public class AmruthaBookService {
   @Autowired
   AmruthaBookRepo bookRepo;

   public AmruthaBook addBook(AmruthaBook book)
   {
        return bookRepo.save(book);
   }

   public List<AmruthaBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<AmruthaBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public AmruthaBook updateBook(int id,AmruthaBook book)
   {
        AmruthaBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
