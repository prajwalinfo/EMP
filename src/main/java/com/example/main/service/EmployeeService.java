package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.entity.Employee;
import com.example.main.repository.EmployeeRepository;



@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	public List<Employee> getAll(){ 
		return employeerepository.findAll();
	}
	

}