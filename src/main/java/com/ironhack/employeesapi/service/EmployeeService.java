package com.ironhack.employeesapi.service;

import com.ironhack.employeesapi.model.Employee;
import com.ironhack.employeesapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
