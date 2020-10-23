package com.example.validation_.controller;



import com.example.validation_.entity.Form;
import com.example.validation_.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerForm {
    @Autowired
    private FormService formService;

    @GetMapping("/")
    public String goRegisterForm(Model model) {
        model.addAttribute("listForm", formService.findAll());
        return "view";
    }

    @GetMapping("/create")
    public String goCreateForm(Model model) {
        model.addAttribute("form", new Form());
        return "register_form";
    }

    @PostMapping("/create")
    public String createForm(@Validated @ModelAttribute Form form, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "register_form";
        }
        formService.save(form);
        return "redirect:/";
    }

}
