package com.example.cw_4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cw_4.model.Patient;
import com.example.cw_4.services.PatientService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PatientController {
    public PatientService patientService;
    public PatientController(PatientService patientService)
    {
        this.patientService=patientService;
    }
    @PostMapping("/api/patient")
    public Patient postMethodName(@RequestBody Patient patient) {
        patientService.savePatient(patient);
        return patient;
    }
    
    @GetMapping("/api/patient")
    public List<Patient>>getMethodName() {
        List<Patient> list =  patientService.getPatients();
        return list;
    }
    
    @GetMapping("/api/patient/{patientId}")
    public PatientgetMethodName(@PathVariable("patientId") int id) {
        Patient p =  patientService.getPatientById(id);
        return p;
    }
}
