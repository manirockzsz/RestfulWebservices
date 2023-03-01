package com.resftful.webservices.department;

import com.resftful.webservices.entity.Department;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;

    @RequestMapping(method = RequestMethod.GET, path = "/departments")
    @ResponseBody

    public List<Department> getDepartments(){
        return departmentService.getDepartments();

    }


}
