package com.nazmul.swift.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class EmployeeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emp_id;
    private String emp_name;
    private Integer age;
    private String gender;
    private boolean active_status ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fK_emp_idetails_id")
    private EmployeeDetails employeeDetails;




}
