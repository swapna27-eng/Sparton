package com.example.Sparton.controller;

import com.example.Sparton.entity.Employee;
import com.example.Sparton.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
     EmployeeService employeeService;

    @GetMapping("/getName/{id}")
    public Employee getName(@PathVariable String id) {
        employeeService.getEmployeeName(id);
        System.out.println("children");
        return employeeService.getEmployeeName(id);

    }
}
