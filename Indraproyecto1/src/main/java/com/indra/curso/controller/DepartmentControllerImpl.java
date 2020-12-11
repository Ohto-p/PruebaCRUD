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

import com.indra.curso.entity.Department;
import com.indra.curso.services.DepartmentServices;

@RestController
@RequestMapping(value = "/home/department")
public class DepartmentControllerImpl{
	
	@Autowired
	DepartmentServices departmentServices;
	//C
	//localhost:8080/home/department/add?...
	@PostMapping("/add")
	public String createDepartment(Department department) {
		String res ;
		res = departmentServices.createDepartment(department);
		return res; 
	}
	//R
	//localhost:8080/home/department/ver
	@GetMapping("/ver")
	public List<Department> findAllDepartment(){
		return departmentServices.findallDepartment();
	}
	
	//localhost:8080/home/department/ver/{id}
	@GetMapping("/ver/{departmentid}")
	public Optional<Department> findByIdDepartment(@PathVariable Integer departmentid){
		Optional <Department> department = departmentServices.findDepartmentById(departmentid);
		return department;
	}
	
	//U
	@PutMapping("/actualizar") 
	public String deparmentUpdate(Department deparmentUpdate) {
		String res;
		res = departmentServices.updateDepartment(deparmentUpdate);
		return res;
	}
	
	//D
	@GetMapping("/borrar/{departmentid}")
	public String deleteDepartment(@PathVariable Integer departmentid) {
		String res;
		res=departmentServices.deleteDepartment(departmentid);
		return res;
	}

}
