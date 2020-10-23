package com.example.validation_.service;


import com.example.validation_.entity.Form;

import java.util.List;

public interface FormService {
    List<Form> findAll();

    void save(Form form);
}
