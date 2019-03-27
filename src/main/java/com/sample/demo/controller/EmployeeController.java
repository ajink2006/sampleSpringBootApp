package com.sample.demo.controller;

import com.sample.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String firstPage() {

        return "Welcome to Sample SpringBoot App";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee employeePage() {

        Employee emp = new Employee();
        emp.setName("emp1");
        emp.setDesignation("manager");
        emp.setEmpId("1");
        emp.setSalary(3000);

        return emp;
    }



}
