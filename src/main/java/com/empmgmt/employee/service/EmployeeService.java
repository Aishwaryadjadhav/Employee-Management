package com.empmgmt.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmgmt.employee.entity.employee;
import com.empmgmt.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public employee saveEmployee(employee employee) {
		
		return employeeRepository.save(employee);
	}

}
