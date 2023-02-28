package com.resftful.webservices.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "STUDENT")
public  class Student {
    
        @Id
        @Column(name = "STUDENT_ID")
        private int studentId;
    
        @Column(name = "STUDENT_NAME")
        private String studentName;
    
        @Column(name = "STUDENT_MARKS")
        private int marks;

}
