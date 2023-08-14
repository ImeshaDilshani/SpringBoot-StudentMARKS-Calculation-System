package com.oopmark.oopmark.service;

import com.oopmark.oopmark.model.Student;

import java.util.List;

public interface StudentServiceSaveView {
    void saveStudent(Student student);
    List<Student> getAllStudents();


}
