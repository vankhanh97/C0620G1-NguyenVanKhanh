package com.example.blog_app.repository;


import com.example.blog_app.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String userName);

    AppUser findByUserId(Long userId);


}
