package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Employee;

public interface EmployeeControler {
	
	public List<Employee> getEmployee();
	
	public Optional <Employee> getEmployeeById(Long id);
	
	public Employee addEmployee(Employee employee);
}
