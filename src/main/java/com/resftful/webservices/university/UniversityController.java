package com.resftful.webservices.university;

import com.resftful.webservices.entity.University;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@AllArgsConstructor

@RestController
public class UniversityController {

    @Autowired
    private UniversityService universityService;

   // @GetMapping("/university/")
  //  @ResponseBody
   /* public Optional<University> getUniversityById(@RequestParam String universityName) {
        //return universityService.getUniversityById(id);
        return universityService.getUniversityByName(universityName);
    }
    */


    @GetMapping("/universityName")
    @ResponseBody
    public Optional<University> getUniversityByName(@RequestParam String universityName) {
        return Optional.ofNullable(universityService.getUniversityByName(universityName));
        // other controller methods
    }
}