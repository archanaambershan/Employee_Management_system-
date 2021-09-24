package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("api/vi/")
public class EmployeeController {
    @Autowired
	private EmployeeRepository employrepository;
	
    //get all employees 
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
    	
    	return employrepository.findAll();
    }
}
