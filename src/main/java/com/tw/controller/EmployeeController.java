package com.tw.controller;

import com.tw.model.Employee;
import com.tw.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> getEmps() {
        return new EmployeeService().getEmployees();
    }

}
