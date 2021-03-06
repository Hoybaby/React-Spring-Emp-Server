package com.React.reactEmployee.controller;

import com.React.reactEmployee.entitiy.Employee;
import com.React.reactEmployee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/employees")
    public Employee createEmployee(Employee employee) {


        return employee;
    }
}
