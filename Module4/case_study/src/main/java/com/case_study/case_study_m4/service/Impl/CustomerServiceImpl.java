package com.case_study.case_study_m4.service.Impl;

import com.case_study.case_study_m4.entity.Customer;
import com.case_study.case_study_m4.repository.CustomerRepository;
import com.case_study.case_study_m4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return this.customerRepository.findAll(pageable);
    }

//    @Override
//    public Page<Blog> findAll() {
//        return this.blogRepository.("a");
////        return this.blogService.findAllByNameContainingOrderByIdDesc("a");
////        return this.blogRepository.findAll();
//    }

    @Override
    public Customer findById(Integer id) {
        return this.customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public void delete(Integer id) {
        this.customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findByNameContaining(Pageable pageable, String name) {
        return this.customerRepository.findAllByNameContaining(pageable, name);

    }
}
