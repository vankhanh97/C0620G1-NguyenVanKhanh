package com.example.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerForm {

    @GetMapping("/")
    public String goRegisterForm() {
        return "view";
    }

    @GetMapping("/create")
    public String goCreateForm() {

    }


}
