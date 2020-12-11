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

import com.indra.curso.entity.Jobs;
import com.indra.curso.services.JobsServices;

@RestController
@RequestMapping(value="/home/jobs")
public class JobControllerImpl {
	
	@Autowired
	JobsServices jobservices;
	
	//C
	@PostMapping("/add")
	public String addJob(Jobs jobnew){
		return jobservices.addJob(jobnew);
	}
	//R
	@GetMapping("/ver")
	public List<Jobs> findalljobs(){
		return jobservices.findalljobs();
	}
	@GetMapping("/ver/{jobid}")
	public Optional<Jobs> findjobById(@PathVariable String jobid){
		return jobservices.findJobsById(jobid);
	}
	//U
	@PutMapping("/actualizar")
	public String jobUpdate(Jobs jobUpdate) {
		return jobservices.updateJob(jobUpdate);
	}
	//D
	@GetMapping("/borrar/{jobid}")
	public String jobDelete(@PathVariable String jobid) {
		return jobservices.deleteJob(jobid);	
	}
}
