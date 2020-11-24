package com.case_study.case_study_m4.entity;

import javax.persistence.*;

@Entity
@Table(name = "User_Role",
        uniqueConstraints = {
                @UniqueConstraint(name = "USER_ROLE_UK", columnNames = {"User_Id", "Role_Id"})})
public class UserRole {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "User_Id", nullable = false)
    private com.case_study.case_study_m4.entity.AppUser appUser;

    @ManyToOne
    @JoinColumn(name = "Role_Id", nullable = false)
    private com.case_study.case_study_m4.entity.AppRole appRole;

    public UserRole() {
    }

    public UserRole(com.case_study.case_study_m4.entity.AppUser appUser, com.case_study.case_study_m4.entity.AppRole appRole) {
        this.appUser = appUser;
        this.appRole = appRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.case_study.case_study_m4.entity.AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(com.case_study.case_study_m4.entity.AppUser appUser) {
        this.appUser = appUser;
    }

    public com.case_study.case_study_m4.entity.AppRole getAppRole() {
        return appRole;
    }

    public void setAppRole(com.case_study.case_study_m4.entity.AppRole appRole) {
        this.appRole = appRole;
    }

}
