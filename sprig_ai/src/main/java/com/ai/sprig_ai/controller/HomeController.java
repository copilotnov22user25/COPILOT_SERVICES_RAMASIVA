package com.ai.sprig_ai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ai.sprig_ai.model.Employee;
import com.ai.sprig_ai.repo.EmpRepo;

@RestController
public class HomeController {

    @Autowired
    EmpRepo empRepo;

    @GetMapping("/emp1")
    public List<Employee> getEMP1() {
        return empRepo.getEmpList().values().stream().toList();
    }

     @GetMapping("/emp")
    public List<Employee> getEMP() {
        List<Employee> empList = List.of(
            new Employee(2, "Ramesh", "Pune", 20000),
            new Employee(3, "Rajesh", "Chennai", 30000),
            new Employee(4, "Rahul", "Bangalore", 40000),
            new Employee(5, "Rajendra", "Hyderabad", 50000)
        );

        return empList;
    }

    @GetMapping("/")
    public String getHome() {
        return "Welcome to Spring Boot";
    }
}
