package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "demo")
public class StudentModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
   @Column(name = "identity")
   private int regNo;
   @Column(name = "sName")
   private String studentName;
   @Column(nullable = false)
   private String studentMarks;

public int getRegNo() {
    return regNo;
}
public void setRegNo(int regNo) {
    this.regNo = regNo;
}
public String getStudentName() {
    return studentName;
}
public void setStudentName(String studentName) {
    this.studentName = studentName;
}
public String getStudentMarks() {
    return studentMarks;
}
public void setStudentMarks(String studentMarks) {
    this.studentMarks = studentMarks;
}
}
