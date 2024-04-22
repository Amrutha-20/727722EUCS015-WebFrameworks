package com.example.day9cw1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day9cw1.model.AmruthaPerson;
import com.example.day9cw1.repository.AmruthaPersonRepo;

@Service
public class AmruthaPersonService {
    public AmruthaPersonRepo personRepo;

    public AmruthaPersonService(AmruthaPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AmruthaPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AmruthaPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
