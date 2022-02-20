package com.learnspring.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("greeting")
    public String greeting(Map<String, Object> model){
        model.put("message", "Hello nombre");
        return "greeting";
    }
    @GetMapping("thymeleaf")
    public String thyme(Map<String, Object> model){
        model.put("message", "Hello Thymeleaf");
        return "thymeleaf";
    }


}
