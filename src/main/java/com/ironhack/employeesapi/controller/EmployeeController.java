package com.ironhack.employeesapi.controller;

import com.ironhack.employeesapi.model.Employee;
import com.ironhack.employeesapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
