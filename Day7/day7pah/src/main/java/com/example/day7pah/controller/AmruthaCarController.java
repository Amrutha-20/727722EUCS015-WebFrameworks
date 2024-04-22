package com.example.day7pah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day7pah.model.AmruthaCar;
import com.example.day7pah.service.AmruthaCarService;

@RestController
public class AmruthaCarController {
    @Autowired
    private AmruthaCarService carService;

    @PostMapping("/api/car")
    public ResponseEntity<AmruthaCar> post(@RequestBody AmruthaCar car) {
        if (carService.post(car)) {
            return new ResponseEntity<>(car, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car")
    public ResponseEntity<List<AmruthaCar>> getAll() {
        List<AmruthaCar> li = carService.getAll();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car/distinct")
    public ResponseEntity<AmruthaCar> getbyDistinct(@RequestParam String currentOwnerName, @RequestParam String address) {
        AmruthaCar car = carService.getByDetails(currentOwnerName, address);
        if (car != null) {
            return new ResponseEntity<>(car, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
