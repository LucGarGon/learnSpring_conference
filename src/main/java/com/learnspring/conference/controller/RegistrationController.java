package com.learnspring.conference.controller;

import com.learnspring.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration") Registration reg){
        return "registration";
    }
    @PostMapping("registration")
    public String addRegistration(@ModelAttribute ("registration") Registration reg){
        return "registration";
    }


}
