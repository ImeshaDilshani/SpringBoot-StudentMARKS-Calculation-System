package com.oopmark.oopmark.repository;

import com.oopmark.oopmark.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
