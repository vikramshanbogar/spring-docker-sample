package com.example.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String greetings(){
        String str = "Hello Vikram, Welcome to Docker World";
        return str;
    }
}
