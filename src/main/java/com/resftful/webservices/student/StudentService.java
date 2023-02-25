package com.resftful.webservices.student;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student>  getStudents(){

        List<Student>  students = new ArrayList<>();
        Student s = new Student();
        s.setStudentId(1);
        s.setStudentName("Mani");
        s.setStudentMarks(99);
        s.setStudentAdress("TPT");

        Student s1 = new Student();
        s1.setStudentId(2);
        s1.setStudentName("Haritha");
        s1.setStudentMarks(100);
        s1.setStudentAdress("TIRUPATHI");

        students.add(s);
        students.add(s1);
        return students;


    }
}
