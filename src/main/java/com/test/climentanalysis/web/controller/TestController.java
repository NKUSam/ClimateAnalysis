package com.test.climentanalysis.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("test")
    public String test(){
        return "mytest";
    }

    @GetMapping("test1")
    public String test1(){
        return "mytest1";
    }
    
    @GetMapping("toindex")
    public String toindex(){
        return "";
    }
}
