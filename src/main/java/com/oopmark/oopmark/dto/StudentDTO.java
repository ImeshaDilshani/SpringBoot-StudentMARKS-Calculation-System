package com.oopmark.oopmark.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentDTO {
    private Long id;
    private String studentID;
    private String name;
    private int ca;
    private int practical;
    private int theory;
}
