package com.example.day9pah.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day9pah.model.AmruthaUser;
import com.example.day9pah.repository.AmruthaUserRepo;

@Service
public class AmruthaUserService {
   @Autowired
   private AmruthaUserRepo userRepo;
   
   public boolean postUser(AmruthaUser user)
   {
        try{
            userRepo.save(user);
            return true;
        }
        catch(Exception e){
            return false;
        }   
   }

   public AmruthaUser getById(int userId)
   {
        return userRepo.findByUserId(userId);
   }

   public AmruthaUser getByUserName(String userName)
   {
        return userRepo.findByUserName(userName);
   }
}
