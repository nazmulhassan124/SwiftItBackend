package com.nazmul.swift.controller;

import com.nazmul.swift.dto.Employee;
import com.nazmul.swift.entity.EmployeeInfo;
import com.nazmul.swift.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("empinfo")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;






    @PostMapping("/post")
    public EmployeeInfo post(@RequestBody EmployeeInfo emp) {

        return employeeService.post(emp);
    }

    @PostMapping("/postAll")
    public List<EmployeeInfo> addProduct (@RequestBody List<EmployeeInfo> employeeInfoListList){

        return employeeService.postAll(employeeInfoListList);
    }

    @GetMapping("/get/{id}")
    public EmployeeInfo get(@PathVariable Long id) {

        return employeeService.getById(id);
    }



    @PutMapping("/update")
    public EmployeeInfo update(@RequestBody EmployeeInfo emp) {

        return employeeService.update(emp);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        return employeeService.delete(id);
    }

    @GetMapping("/getAll")
    public List<EmployeeInfo> getAll() {
        return employeeService.getAllEmp();
    }

//    @GetMapping("/getAllEmp")
//    public List<Object> getAllActiveEmployee() {
//        return employeeService.getAllActiveEmployee();
//    }



}
