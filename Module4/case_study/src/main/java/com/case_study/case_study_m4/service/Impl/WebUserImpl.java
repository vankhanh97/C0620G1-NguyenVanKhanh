package com.example.blog_app.service.impl;

import com.example.blog_app.entity.AppUser;
import com.example.blog_app.repository.AppUserRepository;
import com.example.blog_app.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class WebUserImpl implements WebUserService {
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AppUserRepository appUserRepository;


    @Override
    public void save(AppUser appUser) {
        appUser.setEncrytedPassword(passwordEncoder.encode(appUser.getEncrytedPassword()));
        this.appUserRepository.save(appUser);
    }
}
