package com.indra.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.curso.entity.Jobhistory;
import com.indra.curso.services.JobhistoryServices;

@RestController
@RequestMapping(value = "/home/jobhistory")
public class JobHistoryControllerImpl {
	
	@Autowired
	JobhistoryServices jobhistoryServices;
	//R
    @GetMapping("/ver")
	public List<Jobhistory> findallJobHistory(){
    	return jobhistoryServices.findallJobHistory();
    }
    
    @GetMapping("/ver/{employeeid}")
    public List<Jobhistory> findById(@PathVariable Integer employeeid){
    	return jobhistoryServices.findallJobHistory();
    }
			
}
