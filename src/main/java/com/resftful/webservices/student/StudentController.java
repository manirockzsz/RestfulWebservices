package com.resftful.webservices.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;@Controller

@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @RequestMapping(method = RequestMethod.GET, path = "/students")
    @ResponseBody
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

}
