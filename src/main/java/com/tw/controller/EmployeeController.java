package com.tw.controller;

import com.tw.model.Employee;
import com.tw.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Set;

@Controller
public class EmployeeController {

    EmployeeService employeeService = new EmployeeService();

    @RequestMapping("/employees")
    public ModelAndView getEmployees(ModelMap model) {
        List<Employee> employees = employeeService.getEmployees();

        for(Employee employee : employees){

        }
        //model.addAttribute("employees", employees);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employees");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

}
