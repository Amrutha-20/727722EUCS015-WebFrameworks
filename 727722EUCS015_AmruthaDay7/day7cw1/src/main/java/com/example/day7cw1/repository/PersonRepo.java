package com.example.day7cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day7cw1.model.Person;
import java.util.List;


@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>{

    List<Person> findByAge(int age);
    
}
