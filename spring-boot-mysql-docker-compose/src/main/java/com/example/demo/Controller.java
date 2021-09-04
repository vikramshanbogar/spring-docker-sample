package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    UserRepo userRepo;

    @GetMapping
    public String greetings(){
        return "Hello Vikram, Welcome to Docker World";
    }

    @PostMapping
    public User saveuser(@RequestBody User user){
        return userRepo.save(user);

    }
}
