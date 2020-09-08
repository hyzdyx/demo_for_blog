package com.cd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @RequestMapping("login")
    public String login(){
        return "helloworld";
    }
}
