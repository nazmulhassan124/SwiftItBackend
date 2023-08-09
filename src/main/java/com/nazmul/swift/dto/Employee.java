package com.nazmul.swift.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Long emp_id;
    private String emp_name;
    private Integer age;
    private String gender;
    private boolean active_status ;

    private Long fK_emp_idetails_id;
    private Long id;   // emp details
    private String position;
    private double salary;
    private Date joinDate;
    private String address;


}
