package com.example.day13cw2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day13cw2.model.AmruthaDepartment;
import com.example.day13cw2.repository.AmruthaDepartmentRepo;

import java.util.List;

@Service
public class AmruthaDepartmentService {

    @Autowired
    private AmruthaDepartmentRepo departmentRepo;

    public List<AmruthaDepartment> getAllDepartments() {
        return departmentRepo.findAll();
    }

    public AmruthaDepartment createDepartment(AmruthaDepartment department) {
        return departmentRepo.save(department);
    }
}

