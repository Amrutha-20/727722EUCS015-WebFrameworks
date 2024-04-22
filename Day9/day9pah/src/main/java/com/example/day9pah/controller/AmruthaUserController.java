package com.example.day9pah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day9pah.model.AmruthaUser;
import com.example.day9pah.service.AmruthaUserService;

@RestController
@RequestMapping("/api")
public class AmruthaUserController {
    
    @Autowired
    private AmruthaUserService userService;

    @PostMapping("/user")
    public ResponseEntity<AmruthaUser> post(@RequestBody AmruthaUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<AmruthaUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<AmruthaUser> getById(@PathVariable int userId)
    {
        AmruthaUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<AmruthaUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<AmruthaUser> getByUserName(@PathVariable String userName)
    {
        AmruthaUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<AmruthaUser>(user, HttpStatus.OK);
        }
    }
}
