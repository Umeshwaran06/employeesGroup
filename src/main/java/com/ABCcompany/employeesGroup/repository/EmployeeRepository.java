package com.ABCcompany.employeesGroup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ABCcompany.employeesGroup.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
