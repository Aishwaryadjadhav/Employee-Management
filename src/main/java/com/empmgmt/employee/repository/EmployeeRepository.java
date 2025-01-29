package com.empmgmt.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.empmgmt.employee.entity.employee;

@Repository
public interface EmployeeRepository extends JpaRepository<employee, ID> {

}
