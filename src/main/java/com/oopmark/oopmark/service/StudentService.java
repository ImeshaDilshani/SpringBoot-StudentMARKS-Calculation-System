package com.oopmark.oopmark.service;

import com.oopmark.oopmark.dto.StudentDTO;
import com.oopmark.oopmark.model.Student;
import com.oopmark.oopmark.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private  ModelMapper modelMapper;

    public  StudentDTO saveStudent(StudentDTO studentDTO){
        studentRepository.save(modelMapper.map(studentDTO,Student.class));
        return studentDTO;
    }
    public List<StudentDTO> getAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        return modelMapper.map(studentList,new TypeToken<List<StudentDTO>>(){}.getType());
    }
}
