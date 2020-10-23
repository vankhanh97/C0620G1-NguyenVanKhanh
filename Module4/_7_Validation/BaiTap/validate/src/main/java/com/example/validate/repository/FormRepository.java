package com.example.validate.repository;

import com.example.validate.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form, Integer> {
}
