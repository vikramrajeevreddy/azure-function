package com.elcarim.certverification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class verificatoinController {
    @GetMapping("/test")
    public String test(){
        return "this is a test";
    }
}