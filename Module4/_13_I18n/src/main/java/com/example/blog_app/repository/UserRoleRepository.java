package com.example.blog_app.repository;


import com.example.blog_app.entity.AppUser;
import com.example.blog_app.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
