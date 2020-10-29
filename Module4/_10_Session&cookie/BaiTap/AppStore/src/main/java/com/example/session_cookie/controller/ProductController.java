package com.example.session_cookie.controller;

import com.example.session_cookie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String listProduct(Model model) {
        model.addAttribute("listProduct", this.productService.findAll());
        return "list_product";
    }


}
