package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.curso.entity.Employee;
import com.indra.curso.services.EmployeeServices;


@RestController 
@RequestMapping(value="/home")
public class EmployeeControlerImpl {
	
	@Autowired
	EmployeeServices employeeService;
	
	//http://localhost:8080/Home/ver
	@GetMapping("/ver")
	public List<Employee> getEmployees() {
		return employeeService.findAllEmployees();
	}
	
	//http://localhost:8080/home/ver/1
	@GetMapping("/ver/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Long id){
		return employeeService.findEmployeeById(id);
	}

	//http://localhost:8080/home/crear
	@PostMapping("/crear")
	public Employee addEmployee(Employee employee) {
			return employeeService.saveEmployee(employee);
	}
	
//-----------------------------------------------------------------------
	//http://localhost:8080/Home/actualizar
	@GetMapping("/actualizar")
	public String Update() {
		return "Aqui se actualiza";
	}
//-----------------------------------------------------------------------	
	//http://localhost:8080/Home/borrar
	@GetMapping("/borrar/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}
}
