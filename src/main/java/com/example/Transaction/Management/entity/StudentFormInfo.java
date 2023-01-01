package com.example.Transaction.Management.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_form")
public class StudentFormInfo {

    @Id
    @GeneratedValue
    private Long id;
    private String student_name;
    private String student_program;
    private String student_email;
    private String student_batch;
    private double fare;
}
