package com.example.day5cw3.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day5cw3.model.AmruthaLanguage;
import com.example.day5cw3.service.AmruthaLanguageService;

@RestController
public class AmruthaLanguageController {
    public AmruthaLanguageService languageService;
    public AmruthaLanguageController(AmruthaLanguageService languageService)
    {
        this.languageService=languageService;
    }
    @PostMapping("/language")
    public AmruthaLanguage postMethodName(@RequestBody AmruthaLanguage language) {
        
        languageService.saveLanguage(language);
        return language;
    }
    @GetMapping("/language")
    public List<AmruthaLanguage> getMethodName() {
        List<AmruthaLanguage> list =  languageService.getLanguages();
        return list;
    }
    @GetMapping("/language/{languageId}")
    public AmruthaLanguage getlangauge(@PathVariable("languageId") int id) {
        AmruthaLanguage l =  languageService.getLanguageById(id);
        return l;
    }
    
    @PutMapping("/language/{languageId}")
    public AmruthaLanguage putMethodName(@PathVariable int id, @RequestBody AmruthaLanguage language) {
        languageService.updateLanguage(id,language);
        return language;
        
    }

    @DeleteMapping("/language/{languageId}")
    public void delete(@PathVariable("languageId") int id)
    {
        languageService.deleteLanguage(id);
       
    }

}
