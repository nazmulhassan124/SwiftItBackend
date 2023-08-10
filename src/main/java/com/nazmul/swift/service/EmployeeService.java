package com.nazmul.swift.service;

import com.nazmul.swift.dto.Employee;
import com.nazmul.swift.entity.EmployeeDetails;
import com.nazmul.swift.entity.EmployeeInfo;
import com.nazmul.swift.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeInfo post(EmployeeInfo emp) {
        if(!emp.equals(null)) {
            return employeeRepository.save(emp);
        }
        return null;
    }

    public EmployeeInfo getById(Long id) {

        Optional<EmployeeInfo> optional = employeeRepository.findById(id);
        if(optional.isPresent()) {

            return optional.get();
        }
        return null;
    }



    public EmployeeInfo update(EmployeeInfo emp) {
        return employeeRepository.save(emp);
    }

    public String delete(Long id) {
        Optional<EmployeeInfo> optional = employeeRepository.findById(id);
        if(optional.isPresent()) {
            Boolean status = false;
            employeeRepository.softDelete(status, id);
//            employeeRepository.delete(optional.get());
            return "success";
        }
        return "fail";
    }


       public List<EmployeeInfo> getAllEmp() {

        return employeeRepository.allemployee();
    }

//    public List<Object> getAllActiveEmployee() {
//
//        return employeeRepository.getEmployeesFullDetails();
//    }

    public List<EmployeeInfo> postAll(List<EmployeeInfo> emp) {

        return employeeRepository.saveAll(emp);
    }





}
