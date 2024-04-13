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

import com.example.day5cw3.model.Language;
import com.example.day5cw3.service.LanguageService;

@RestController
public class LanguageController {
    public LanguageService languageService;
    public LanguageController(LanguageService languageService)
    {
        this.languageService=languageService;
    }
    @PostMapping("/language")
    public Language postMethodName(@RequestBody Language language) {
        
        languageService.saveLanguage(language);
        return language;
    }
    @GetMapping("/language")
    public List<Language> getMethodName() {
        List<Language> list =  languageService.getLanguages();
        return list;
    }
    @GetMapping("/language/{languageId}")
    public Language getlangauge(@PathVariable("languageId") int id) {
        Language l =  languageService.getLanguageById(id);
        return l;
    }
    
    @PutMapping("/language/{languageId}")
    public Language putMethodName(@PathVariable int id, @RequestBody Language language) {
        languageService.updateLanguage(id,language);
        return language;
        
    }

    @DeleteMapping("/language/{languageId}")
    public void delete(@PathVariable("languageId") int id)
    {
        languageService.deleteLanguage(id);
       
    }

}
