package com.case_study.case_study_m4.repository;

import com.case_study.case_study_m4.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findAllByNameContaining(Pageable pageable, String name);
    Page<Customer> findAll(Pageable pageable);
}
