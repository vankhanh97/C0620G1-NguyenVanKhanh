package com.example.blog_app.repository;

import com.example.blog_app.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleId(Long roleId);
}
