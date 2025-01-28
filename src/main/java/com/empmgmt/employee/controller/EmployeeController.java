package com.empmgmt.employee.controller;



import java.util.Arrays;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empmgmt.employee.entity.employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	
	List<employee> employees = Arrays.asList(new employee(1, "aishu", 20000, "IT"),
			new employee(2,"pari",30000,"web"));
	
	
	@RequestMapping
	public List<employee> getemployees(){
		return employees;
		
	}
	
  
	
 
	 
    
 

	


}
