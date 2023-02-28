package com.resftful.webservices.repository;

import com.resftful.webservices.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
