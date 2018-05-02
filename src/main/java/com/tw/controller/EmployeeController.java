package com.tw.controller;

import com.tw.model.Employee;
import com.tw.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class EmployeeController {

    EmployeeService employeeService = new EmployeeService();

    @RequestMapping("/employees")
    public Set<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

}
