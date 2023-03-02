package com.resftful.webservices.university;

import com.resftful.webservices.entity.University;
import com.resftful.webservices.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public University getUniversityByName(String universityName) {
        return universityRepository.findByUniversityName(universityName);
    }

    // other service methods
}
