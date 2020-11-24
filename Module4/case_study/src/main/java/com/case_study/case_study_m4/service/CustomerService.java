package com.case_study.case_study_m4.service;

import com.case_study.case_study_m4.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Page<Customer> findAll(Pageable pageable);

    Customer findById(Integer id);

    void save(Customer customer);

    void delete(Integer id);

    Page<Customer> findByNameContaining(Pageable pageable, String name);
}
