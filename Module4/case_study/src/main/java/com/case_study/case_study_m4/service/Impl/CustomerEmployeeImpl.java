package com.case_study.case_study_m4.service.Impl;

import com.case_study.case_study_m4.entity.Customer;
import com.case_study.case_study_m4.entity.Employee;
import com.case_study.case_study_m4.repository.CustomerRepository;
import com.case_study.case_study_m4.repository.EmployeeRepository;
import com.case_study.case_study_m4.service.CustomerService;
import com.case_study.case_study_m4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerEmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return this.employeeRepository.findAll(pageable);
    }

//    @Override
//    public Page<Blog> findAll() {
//        return this.blogRepository.("a");
////        return this.blogService.findAllByNameContainingOrderByIdDesc("a");
////        return this.blogRepository.findAll();
//    }

    @Override
    public Employee findById(Integer id) {
        return this.employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee customer) {
        this.employeeRepository.save(customer);
    }

    @Override
    public void delete(Integer id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findByNameContaining(Pageable pageable, String name) {
        return this.employeeRepository.findAllByNameContaining(pageable, name);

    }
}
