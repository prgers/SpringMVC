package com.prger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class TestController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password){
        return "username = " + username + " password = " + password + "login success!!!";
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public String get(@PathVariable("id") Integer id) {
        return "getSuccess id = " + id;
    }
}
