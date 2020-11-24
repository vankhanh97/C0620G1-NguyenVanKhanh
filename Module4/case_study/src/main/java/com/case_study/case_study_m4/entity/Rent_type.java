package com.case_study.case_study_m4.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
@Entity @Table(name = "rent_type")
public class Rent_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rent_type_id")
    private Integer id;

    @Column(name = "rent_type_name")
    private String name;

    public Rent_type() {
    }

    public Rent_type(Integer id, String name, List<Service> serviceList) {
        this.id = id;
        this.name = name;
        this.serviceList = serviceList;
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

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    @OneToMany(mappedBy = "rent_type", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Service> serviceList;
}
