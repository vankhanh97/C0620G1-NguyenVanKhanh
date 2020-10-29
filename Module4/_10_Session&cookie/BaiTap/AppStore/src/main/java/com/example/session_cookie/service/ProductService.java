package com.example.session_cookie.service;

import com.example.session_cookie.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProductService {

    List<Product> findAll();

}
