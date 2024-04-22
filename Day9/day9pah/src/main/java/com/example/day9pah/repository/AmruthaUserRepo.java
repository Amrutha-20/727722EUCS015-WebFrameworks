package com.example.day9pah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.day9pah.model.AmruthaUser;
import java.util.List;


@Repository
public interface AmruthaUserRepo extends JpaRepository<AmruthaUser, Integer> {
    @Query(value = "SELECT u FROM User u WHERE u.userId = ?1")
    AmruthaUser findByUserId(int userId);

    @Query(value = "SELECT u FROM User u WHERE u.userName=?1")
    AmruthaUser findByUserName(String userName);
}
