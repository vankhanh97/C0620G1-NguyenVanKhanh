package com.case_study.case_study_m4.controller;

import com.case_study.case_study_m4.entity.AppRole;
import com.case_study.case_study_m4.entity.AppUser;
import com.case_study.case_study_m4.entity.UserRole;
import com.case_study.case_study_m4.repository.AppUserRepository;
import com.case_study.case_study_m4.repository.UserRoleRepository;
import com.case_study.case_study_m4.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class ControllerLogin {

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private WebUserService webUserService;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @GetMapping("/login")
    public String goLogin() {
        return "login/login";
    }

    @GetMapping("/home")
    public String goHome() {
        return "home/home";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("appUser", new AppUser());
        model.addAttribute("appRole", new AppRole());
        return "/login/register";
    }

    @PostMapping("/register")
    public String registerBlog(@ModelAttribute AppUser appUser, @RequestParam String[] role) throws Exception {

        AppUser appUser1 = appUserRepository.findByUserName(appUser.getUserName());
        if (appUser1 != null) {
            throw new Exception();
        }
        webUserService.save(appUser);
//        AppUser appUser2 = appUserRepository.findByUserId(id);
        for (int i = 0; i < 1; i++) {
            AppRole appRole;
            if (role[i].equals("1")) {
                appRole = new AppRole((long) 1, "ROLE_ADMIN");
            } else {
                appRole = new AppRole((long) 2, "ROLE_USER");
            }
            userRoleRepository.save(new UserRole(appUser, appRole));
        }
        return "redirect:/login";
    }

    @ExceptionHandler(Exception.class)
    public String handleEx(RedirectAttributes redirectAttributes) {
        String message = "User already used !";
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/register";
    }
    @GetMapping("/403")
    public String error(){
        return "/error/403";
    }
}

