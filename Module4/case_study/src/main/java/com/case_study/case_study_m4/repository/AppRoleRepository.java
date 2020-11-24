package com.example.blog_app.repository;

import com.case_study.case_study_m4.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleId(Long roleId);
}
