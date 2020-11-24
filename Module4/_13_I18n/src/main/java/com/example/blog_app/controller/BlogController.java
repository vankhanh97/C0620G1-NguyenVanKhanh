package com.example.blog_app.controller;

import com.example.blog_app.entity.AppRole;
import com.example.blog_app.entity.AppUser;
import com.example.blog_app.entity.UserRole;
import com.example.blog_app.repository.AppRoleRepository;
import com.example.blog_app.repository.AppUserRepository;
import com.example.blog_app.repository.UserRoleRepository;
import com.example.blog_app.service.impl.BlogService;
import com.example.blog_app.entity.Blog;
import com.example.blog_app.service.impl.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/blog")
@SessionAttributes(value = "userLogin")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private WebUserService webUserService;

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private AppRoleRepository appRoleRepository;

    @GetMapping("/")
    public String goHome(Model model, @PageableDefault(size = 2) Pageable pageable,
                         @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listBlog", blogService.findByNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("listBlog", blogService.findAll(pageable));

        }

        model.addAttribute("keywordOld", keywordOld);
        return "blog/Home";
    }

    @GetMapping("/create")
    public String goCreateStudent(Model model) {
        model.addAttribute("blog", new Blog());
        return "blog/create_blog";
    }

    @PostMapping("/create")
    public String saveBlog(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping("/detail")
    public String goDetailBlog(@RequestParam Integer id, Model model) {
        model.addAttribute("blogDetail", blogService.findById(id));
        return "blog/detail_blog";
    }

    @GetMapping("/delete")
    public String deleteBlog(@RequestParam Integer id) {
        blogService.delete(id);
        return "redirect:/blog/";
    }

    @GetMapping("/update")
    public String goUpdateBlog(Model model, @RequestParam Integer id) {
        model.addAttribute("blog", this.blogService.findById(id));
        return "blog/update";
    }

    @PostMapping("/update")
    public String updateBlog(@ModelAttribute Blog blog) {
        this.blogService.save(blog);
        return "redirect:/blog/";

    }



    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("appUser", new AppUser());
        model.addAttribute("appRole", new AppRole());
        return "/blog/register";
    }

    @PostMapping("/register")
    public String registerBlog(@ModelAttribute AppUser appUser, @RequestParam String[] role) throws Exception {
//        long id = (long) (Math.random() * 1000);
//        appUser.setUserId(id);
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
        return "redirect:/";
    }

    @GetMapping("/403")
    public String error(){
        return "/blog/403";
    }


    @ExceptionHandler(Exception.class)
    public String handleEx(RedirectAttributes redirectAttributes) {
        String message = "User already used !";
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/blog/register";
    }
}
