package com.tw.service;

import com.tw.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


public class EmployeeService {

    List<Employee> employees;

    public List<Employee> getEmployees() {
        employees = new ArrayList<>();
        employees.add(new Employee(0, "小明", 20, "男"));
        employees.add(new Employee(1, "小红", 19, "女"));
        employees.add(new Employee(2, "小智", 15, "男"));
        employees.add(new Employee(3, "小刚", 16, "女"));
        employees.add(new Employee(4, "小明", 25, "女"));
        return employees;
    }
}
