package com.tw.service;

import com.tw.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class EmployeeService {

    Set<Employee> employees;

    {
        employees = new HashSet<>();
        employees.add(new Employee(0, "小明", 20, "男"));
        employees.add(new Employee(1, "小红", 19, "女"));
        employees.add(new Employee(2, "小智", 15, "男"));
        employees.add(new Employee(3, "小刚", 16, "女"));
        employees.add(new Employee(4, "小明", 25, "女"));
    }

    public Set<Employee> getEmployees() {
        return employees;
    }
}
