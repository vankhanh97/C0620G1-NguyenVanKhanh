package com.example.validation_.repository;

import com.example.validation_.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form, Integer> {
}
