package com.case_study.case_study_m4.service;

import com.case_study.case_study_m4.entity.Customer;
import com.case_study.case_study_m4.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Page<Employee> findAll(Pageable pageable);

    Employee findById(Integer id);

    void save(Employee customer);

    void delete(Integer id);

    Page<Employee> findByNameContaining(Pageable pageable, String name);
}
