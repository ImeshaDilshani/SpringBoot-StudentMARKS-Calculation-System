package com.oopmark.oopmark.controller;

import com.oopmark.oopmark.dto.StudentDTO;
import com.oopmark.oopmark.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/student")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/insert")
    public String save(){
        return "insert";
    }

    @PostMapping("/saveStudent")
    public ResponseEntity saveStudent(@RequestBody StudentDTO studentDTO){
        return ResponseEntity.ok(studentService.saveStudent(studentDTO));
    }

    @GetMapping("/view")
    public String view(){
        return "view";
    }


    @GetMapping("/getStudent")
    public List<StudentDTO> getStudent(){
        return studentService.getAllStudent();
    }

}
