package com.case_study.case_study_m4.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "division")
public class Division {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "division_id")
        private Integer id;

        @Column(name = "division_name")
        private String name;

        public Division() {
        }

        public Division(Integer id, String name, List<Employee> employeeList) {
                this.id = id;
                this.name = name;
                this.employeeList = employeeList;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public List<Employee> getEmployeeList() {
                return employeeList;
        }

        public void setEmployeeList(List<Employee> employeeList) {
                this.employeeList = employeeList;
        }

        @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
        @JsonBackReference
        private List<Employee> employeeList;
}
