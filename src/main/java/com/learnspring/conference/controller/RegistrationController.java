package com.learnspring.conference.controller;

import com.learnspring.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration") Registration reg){
        return "registration";
    }
    @PostMapping("registration")
    public String addRegistration(
            @Valid
            @ModelAttribute ("registration") Registration reg,
            BindingResult result){
        if(result.hasErrors()){
            return "registration";
        }
        return "registration";
    }


}
