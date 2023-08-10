package com.oopmark.oopmark.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {

    private Long id;
    private String studentID;
    private String Name;
    private int CA;
    private int Practical;
    private int Theory;
}
