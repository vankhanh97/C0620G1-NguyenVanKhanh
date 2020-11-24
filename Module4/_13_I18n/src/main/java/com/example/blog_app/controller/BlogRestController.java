package com.example.blog_app.controller;

import com.example.blog_app.service.impl.BlogService;
import com.example.blog_app.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/blogRest")
@CrossOrigin
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/list")
    public ResponseEntity<List<Blog>> getListBlog() {
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Blog> getStudent(@PathVariable Integer id) throws Exception {
        return new ResponseEntity<>(blogService.findById(id), HttpStatus.OK);
    }
    @GetMapping("/tengicungdc")
    public ResponseEntity<Page<Blog>> getPageBlog(Pageable pageable) {
        return new ResponseEntity<>(blogService.findAll(pageable), HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<Void> registerStudent(@RequestBody Blog blog, UriComponentsBuilder ucBuilder) {
        this.blogService.save(blog);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/studentRest/detail/{id}").buildAndExpand(blog.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}
