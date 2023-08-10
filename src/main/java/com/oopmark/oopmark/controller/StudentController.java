package com.oopmark.oopmark.controller;

import com.oopmark.oopmark.dto.StudentDTO;
import com.oopmark.oopmark.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/saveStudent")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }


    @GetMapping("getStudent")
    public List<StudentDTO> getStudent(){
        return studentService.getAllStudent();
    }
}
