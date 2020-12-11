package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.curso.entity.Employee;
import com.indra.curso.services.EmployeeServices;


@RestController 
@RequestMapping(value="/home/employee")
public class EmployeeControlerImpl {
	
	@Autowired
	EmployeeServices employeeService;
	
	//http://localhost:8080/Home/employee/ver     (Checked)
	@GetMapping("/ver")
	public List<Employee> getEmployees() {
		return employeeService.findAllEmployees();
	}
	
	//http://localhost:8080/home/employee/ver/1  (Checked)
	@GetMapping("/ver/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer id){
		return employeeService.findEmployeeById(id);
	}

	//http://localhost:8080/home/employee/crear  (Checked)
	@PostMapping("/crear")
	public Employee addEmployee(Employee employee) {
		 System.out.println(employee);
			return employeeService.saveEmployee(employee);
	}
	

	//http://localhost:8080/home/employee/actualizar       
	@PutMapping("/actualizar")
	public String Update(Employee employeeupdate) {
		return employeeService.updateEmployee(employeeupdate);
	}
	

	//http://localhost:8080/home/employee/borrar/{id}    (Checked)
	@GetMapping("/borrar/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		return employeeService.deleteEmployee(id);
	}
}
