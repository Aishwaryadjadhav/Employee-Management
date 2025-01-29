package com.empmgmt.employee.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empmgmt.employee.entity.employee;
import com.empmgmt.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	List<employee> employees=new ArrayList<>();
	
	@PostMapping("/add")
	public String AddEmployee(@RequestBody employee employee) {
		System.out.println("input" + employee.toString());
//		employees.add(employee);
		employee saveEmployee= employeeService.saveEmployee(employee);
		
		return "employee inserted succesfully with id : " + saveEmployee.getId();
		
	}
	
	
	@GetMapping
	public List<employee> getemployees(){
		return employees;	
	}
	
	// ....get the data by using id....//
	
	@GetMapping("/{id}")
	public employee getEmployeeById(@PathVariable int id) {
		
		for(employee employee: employees) {
			if(employee.getId()==id) {
				return employee;
			}	
		}
		return null;
	}
	
	
}
