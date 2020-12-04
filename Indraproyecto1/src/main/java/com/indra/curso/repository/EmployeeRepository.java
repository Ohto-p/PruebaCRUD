package com.indra.curso.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.curso.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Void save (Optional<Employee> EmployeeToUpdate);
	
	//Aqui van las consultas que no sean directgas, o con condficones where
	//En caso de que si se hacen los metodos
}
