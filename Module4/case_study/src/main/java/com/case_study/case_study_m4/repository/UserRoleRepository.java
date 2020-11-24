package com.case_study.case_study_m4.repository;

import com.case_study.case_study_m4.entity.AppUser;
import com.case_study.case_study_m4.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
