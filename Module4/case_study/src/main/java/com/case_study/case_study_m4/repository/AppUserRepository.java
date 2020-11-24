package com.case_study.case_study_m4.repository;


import com.case_study.case_study_m4.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String userName);

    AppUser findByUserId(Long userId);


}
