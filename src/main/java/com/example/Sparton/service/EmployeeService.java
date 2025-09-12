package com.example.Sparton.service;

import com.example.Sparton.entity.Employee;
import com.example.Sparton.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeeName(String id) {
        System.out.println("ID : 18D");

        Employee employee = new Employee();


        employee.setEmployeeId("98459");
        employee.setName("Swapna");
        employee.setAddress("Bagalkot");
        employee.setGrade("A+");
        employee.setPincode("587102");


        employeeRepository.save(employee);
        Optional<Employee> employee1 = employeeRepository.findById("98459");

        return employee1.get();
    }

}
