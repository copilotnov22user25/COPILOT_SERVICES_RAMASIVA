package com.ai.sprig_ai.repo;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.ai.sprig_ai.model.Employee;

@Repository
public class EmpRepo {

    public HashMap<Integer,Employee> getEmpList() {
        HashMap<Integer,Employee> empList = new HashMap<Integer,Employee>();
        empList.put(2, new Employee(2, "Ramesh", "Pune", 20000));
        empList.put(3, new Employee(3, "Rajesh", "Chennai", 30000));
        empList.put(4, new Employee(4, "Rahul", "Bangalore", 40000));
        empList.put(5, new Employee(5, "Rajendra", "Hyderabad", 50000));
        return empList;
    }
}
