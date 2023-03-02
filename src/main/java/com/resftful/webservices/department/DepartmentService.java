package com.resftful.webservices.department;

import com.resftful.webservices.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public List<com.resftful.webservices.entity.Department> getDepartments(){



        return departmentRepository. findAll();
    }



}
