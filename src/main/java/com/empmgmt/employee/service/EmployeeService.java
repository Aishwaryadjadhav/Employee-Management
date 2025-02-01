package com.empmgmt.employee.service;

import java.util.List;


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

	
	public List<employee> getEmployee() {
		return employeeRepository.findAll();
	}


	public employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
				
	}


	public String updateEmployee(int id, employee employee) {
		employee empFromDB = getEmployeeById(id);
		if(empFromDB != null) {
			empFromDB.setDepartment(employee.getDepartment());
			empFromDB.setName(employee.getName());
			empFromDB.setSalary(employee.getSalary());
			saveEmployee(empFromDB);
			return "employee updated succecfully";
		}else {
			return "requested employee is not present in database, please use diff ID";
		}		
	}


	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

	
}
