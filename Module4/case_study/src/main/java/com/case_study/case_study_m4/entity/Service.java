package com.case_study.case_study_m4.entity;

import javax.persistence.*;

@Entity @Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Integer id;
    @Column(name = "service_name")
    private String name;
    @Column(name = "service_area")
    private String area;
    @Column(name = "service_cost")
    private String cost;
    @Column(name = "service_max_people")
    private String max_people;
    @Column(name = "service_standard_room")
    private String standard_room;
    @Column(name = "service_description_other_convenience")
    private String description_other_convenience;
    @Column(name = "service_pool_area")
    private String pool_area;
    @Column(name = "service_number_floor")
    private String number_floor;

    public Service() {
    }

    public Service(Integer id, String name, String area, String cost, String max_people, String standard_room, String description_other_convenience, String pool_area, String number_floor, Service_type service_type, Rent_type rent_type) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.max_people = max_people;
        this.standard_room = standard_room;
        this.description_other_convenience = description_other_convenience;
        this.pool_area = pool_area;
        this.number_floor = number_floor;
        this.service_type = service_type;
        this.rent_type = rent_type;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getMax_people() {
        return max_people;
    }

    public void setMax_people(String max_people) {
        this.max_people = max_people;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public void setDescription_other_convenience(String description_other_convenience) {
        this.description_other_convenience = description_other_convenience;
    }

    public String getPool_area() {
        return pool_area;
    }

    public void setPool_area(String pool_area) {
        this.pool_area = pool_area;
    }

    public String getNumber_floor() {
        return number_floor;
    }

    public void setNumber_floor(String number_floor) {
        this.number_floor = number_floor;
    }

    public Service_type getService_type() {
        return service_type;
    }

    public void setService_type(Service_type service_type) {
        this.service_type = service_type;
    }

    public Rent_type getRent_type() {
        return rent_type;
    }

    public void setRent_type(Rent_type rent_type) {
        this.rent_type = rent_type;
    }

    @ManyToOne
    @JoinColumn(name = "service_type_id", referencedColumnName = "service_type_id")
    private Service_type service_type;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "rent_type_id")
    private Rent_type rent_type;
}
