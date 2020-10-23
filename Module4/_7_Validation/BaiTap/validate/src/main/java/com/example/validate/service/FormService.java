package com.example.validate.service;

import com.example.validate.entity.Form;

import java.util.List;

public interface FormService {
    List<Form> findAll();

    void save(Form form);
}
