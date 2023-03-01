package com.resftful.webservices.student;

import com.resftful.webservices.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;
    public List<com.resftful.webservices.entity.Student>  getStudents(){
        return studentRepository.findAll();
    }
}
