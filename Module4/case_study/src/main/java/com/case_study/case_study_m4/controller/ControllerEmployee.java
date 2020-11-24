package com.case_study.case_study_m4.controller;

import com.case_study.case_study_m4.entity.Customer;
import com.case_study.case_study_m4.entity.Employee;
import com.case_study.case_study_m4.repository.CustomerTypeRepository;
import com.case_study.case_study_m4.service.CustomerService;
import com.case_study.case_study_m4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class ControllerEmployee {

    @Autowired
    private EmployeeService employeeService;




    @GetMapping("/")
    public String goListCustomer(Model model, @PageableDefault(size = 5) Pageable pageable,
                                 @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("employeeList", employeeService.findByNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("employeeList", employeeService.findAll(pageable));

        }
//        model.addAttribute("customer_type_list", customerTypeRepository.findAll());
        model.addAttribute("keywordOld", keywordOld);
        model.addAttribute("employee", new Employee());
        return "employee/list_employee";
    }

//    @GetMapping("/create")
//    public String goCreateCustomer(Model model) {
//        model.addAttribute("customer", new Customer());
//        return "customer/list_customer";
//    }

    @PostMapping("/create")
    public String saveCustomer(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes) {
        employeeService.save(employee);
        String message = "Create Customer success!!!";
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/employee/";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam Integer id) {
        employeeService.delete(id);
        return "redirect:/employee/";
    }

//    @GetMapping("/update")
//    public String goUpdateCustomer(Model model, @RequestParam Integer id) {
//        model.addAttribute("customer", this.customerService.findById(id));
//        return "customer/update_customer";
//    }
//
//    @PostMapping("/update")
//    public String updateCustomer(@ModelAttribute Customer customer) {
//        this.customerService.save(customer);
//        return "redirect:/list_customer/";}

}
