package com.example.validation_.service;


import com.example.validation_.entity.Form;
import com.example.validation_.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServiceImpl implements FormService {
    @Autowired
    private FormRepository formRepository;

    @Override
    public List<Form> findAll() {
        return formRepository.findAll();
    }

    @Override
    public void save(Form form) {
        this.formRepository.save(form);
    }
}
