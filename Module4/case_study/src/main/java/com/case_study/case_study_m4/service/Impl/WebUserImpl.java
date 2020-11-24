package com.case_study.case_study_m4.service.Impl;


import com.case_study.case_study_m4.entity.AppUser;
import com.case_study.case_study_m4.repository.AppUserRepository;
import com.case_study.case_study_m4.service.WebUserService;
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
