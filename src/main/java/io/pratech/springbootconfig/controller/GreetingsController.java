package io.pratech.springbootconfig.controller;

import io.pratech.springbootconfig.config.DbConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

//    @Value("${my.message : hii i am default}")
    @Value("${my.message}")
    private String msg;

    @Autowired
    private DbConfig dbConfig;

    @RequestMapping("/greetings")
    public String greetings(){
        return msg+" "+dbConfig.getUser()+" "+dbConfig.getPassword();
    }
}
