package com.example.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.entity.Employee;
import com.example.main.service.EmployeeService;


@Controller
public class EmployeeController {
	
	
	EmployeeService employeeservice;
	
	@GetMapping("/api/employee")
	public List<Employee> getAllEmployee(){
		return employeeservice.getAll();
	}

}