package com.mavenproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test(@RequestParam("text")String text){
        return text;
    }
    @GetMapping("/test")
    public String test1(){
        return "test";
    }
}
