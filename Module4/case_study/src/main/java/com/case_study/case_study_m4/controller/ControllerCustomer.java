package com.case_study.case_study_m4.controller;

import com.case_study.case_study_m4.entity.Customer;
import com.case_study.case_study_m4.repository.CustomerTypeRepository;
import com.case_study.case_study_m4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class ControllerCustomer {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeRepository customerTypeRepository;


    @GetMapping("/")
    public String goListCustomer(Model model, @PageableDefault(size = 5) Pageable pageable,
                                 @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("customerList", customerService.findByNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("customerList", customerService.findAll(pageable));

        }
        model.addAttribute("customer_type_list", customerTypeRepository.findAll());
        model.addAttribute("keywordOld", keywordOld);
        model.addAttribute("customer", new Customer());
        return "customer/list_customer";
    }

//    @GetMapping("/create")
//    public String goCreateCustomer(Model model) {
//        model.addAttribute("customer", new Customer());
//        return "customer/list_customer";
//    }

    @PostMapping("/create")
    public String saveCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        String message = "Create Customer success!!!";
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/customer/";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam Integer id ) {
        customerService.delete(id);
        return "redirect:/customer/";
    }

    @GetMapping("/update")
    public String goUpdateCustomer(Model model, @RequestParam Integer id) {
        model.addAttribute("customer", this.customerService.findById(id));
        return "customer/update_customer";
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer/";}

    }

