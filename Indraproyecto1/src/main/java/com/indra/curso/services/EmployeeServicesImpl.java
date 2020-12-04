package com.indra.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.indra.curso.entity.Employee;
import com.indra.curso.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
	}
	
	@Override
	public Optional<Employee> findEmployeeById(Long id){
		Optional<Employee> employee = employeeRepository.findById(id);
		return  employee;
	}
	
	@Override
	public Employee saveEmployee(Employee employeeNew) {
		
		if(employeeNew != null) {
			return employeeRepository.save(employeeNew);
		}
		return new Employee();
	}
	
	@Override
	public String deleteEmployee(Long id) {
		if(employeeRepository.findById(id).isPresent()) {
			employeeRepository.deleteById(id);
			return "Empleado elimidado correctamente.";
		}
		return "Error! El empleado no existe";
	}
	
	@Override 
	public String updateEmployee(Employee employeeUpdated) {
		
		Long num = employeeUpdated.getEmployeeid();
		if(employeeRepository.findById(num).isPresent()) {
			Employee employeeToUpdate = new Employee();
			employeeToUpdate.setEmployee_id(employeeToUpdate.getEmployeeid());
			employeeToUpdate.setFirstname(employeeToUpdate.getFirstname());
			employeeToUpdate.setLastname(employeeToUpdate.getLastname());
			employeeToUpdate.setEmail(employeeToUpdate.getEmail());
			employeeToUpdate.setPhonenumber(employeeToUpdate.getPhonenumber());
			employeeToUpdate.setHiredate(employeeToUpdate.getHiredate());
			employeeToUpdate.setJobId(employeeToUpdate.getJobId());
			employeeToUpdate.setSalary(employeeToUpdate.getSalary());
			employeeToUpdate.setCommissionpct(employeeToUpdate.getCommissionpct());
			employeeToUpdate.setManagerid(employeeToUpdate.getManagerid());
			employeeToUpdate.setDepartmentid(employeeToUpdate.getDepartmentid());
			return "Empleado modificado";
		}
		return "!Error al modificar el Empleado";
	}
	
	
}
