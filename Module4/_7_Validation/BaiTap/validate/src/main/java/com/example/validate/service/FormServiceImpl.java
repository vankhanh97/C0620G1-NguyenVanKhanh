package com.example.validate.service;

import com.example.validate.entity.Form;
import com.example.validate.repository.FormRepository;
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
