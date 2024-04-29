package com.example.day12cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12cw2.model.AmruthaStudentDetail;
import com.example.day12cw2.repository.AmruthaStudentDetailrepo;
import com.example.day12cw2.repository.AmruthaStudentrepo;


@Service
public class AmruthaStudentDetailService {
    @Autowired
    AmruthaStudentDetailrepo studentDetailRepository;
    @Autowired
    AmruthaStudentrepo studentRepository;
    public AmruthaStudentDetail addStudentDetail(int id,AmruthaStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
