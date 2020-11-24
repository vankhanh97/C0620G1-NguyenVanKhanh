package com.example.blog_app.service.impl;


import com.example.blog_app.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Page<Blog> findAll(Pageable pageable);

//    List<Blog> findAll();

    Blog findById(Integer id);

    void save(Blog blog);

    void delete(Integer id);

    Page<Blog> findByNameContaining(Pageable pageable, String name);


}
