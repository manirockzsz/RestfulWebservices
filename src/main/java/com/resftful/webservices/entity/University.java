package com.resftful.webservices.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "UNIVERSITY")
public class University {

    @Id
    @Column(name = "UNIVERSITY_id")
    private int universityId;

    @Column(name = "UNIVERSITY_name")
    private String universityName;

    @Column(name = "UNIVERSITY_count")
    private int universityCount;

    // getters and setters
}
