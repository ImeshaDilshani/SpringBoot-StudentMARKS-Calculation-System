package com.oopmark.oopmark.controller;

import com.oopmark.oopmark.model.Student;
import com.oopmark.oopmark.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
     StudentService studentService;

    @RequestMapping("/")
    public String saveStudentMarks(Model model){
        model.addAttribute("student",new Student());
        return "insert";
    }

    @RequestMapping(value = "/" ,method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute Student student, Model model){
        student.setFinalMarks ((student.getCa()*0.2) + (student.getPractical()*0.2) + (student.getTheory()*.6));
        studentService.saveStudent(student);
        System.out.println(student.toString());
        return "redirect:/";
    }

    @RequestMapping("/viewStudent")
    public String getStudent(Model model){
        model.addAttribute("students" , studentService.getAllStudents());
        return "view";
    }

}
