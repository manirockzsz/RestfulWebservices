package com.resftful.webservices.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table (name = "department")

public class Department {

    @Id
    @Column(name = "DEPARTMENT_ID")
    private int departmentId;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "DEPARTMENT_COUNT")
    private int count;




}
