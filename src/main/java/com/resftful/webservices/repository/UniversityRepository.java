package com.resftful.webservices.repository;

import com.resftful.webservices.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Integer> {
    University findByUniversityName(String universityName);
}

