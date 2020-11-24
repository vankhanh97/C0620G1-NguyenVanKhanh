package com.case_study.case_study_m4.repository;

import com.case_study.case_study_m4.entity.Customer;
import com.case_study.case_study_m4.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository <Employee,Integer> {
    Page<Employee> findAllByNameContaining(Pageable pageable, String name);
    Page<Employee> findAll(Pageable pageable);

}
