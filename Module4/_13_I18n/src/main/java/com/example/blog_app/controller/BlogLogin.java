package com.example.blog_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value = "userLogin")
public class BlogLogin {
    @GetMapping(value = {"/", "/login"})
    public String goLogin() {
        return "blog/login";
    }

//    @GetMapping("/logout")
//    public String logOut() {
//        return "redirect:/logout";
//    }
}
