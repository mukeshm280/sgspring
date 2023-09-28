package com.sgspring.trade.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/getUser")
    public String getUser() {
        return "Active";
    }

}


