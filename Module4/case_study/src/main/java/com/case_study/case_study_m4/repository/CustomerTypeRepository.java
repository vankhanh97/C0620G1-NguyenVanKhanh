package com.case_study.case_study_m4.repository;

import com.case_study.case_study_m4.entity.Customer;
import com.case_study.case_study_m4.entity.Customer_type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerTypeRepository extends JpaRepository<Customer_type, Integer> {
    List<Customer_type> findAll();
}
