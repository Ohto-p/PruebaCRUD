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

import com.indra.curso.entity.Region;
import com.indra.curso.services.RegionServices;

@RestController
@RequestMapping("/home/region")
public class RegionControllerImpl {
	@Autowired
	RegionServices regionServices;
	
	//C
	@PostMapping("/add")
	public String addRegion(Region regionNew) {
		return regionServices.addRegion(regionNew);
	}
	//R
	@GetMapping("/ver")
	public List<Region> findAllRegion(){
		return regionServices.findallRegion();
	}
	@GetMapping("/ver/{regionid}")
	public Optional<Region> findByIdRegion(@PathVariable Integer regionid){
		return regionServices.findByIdRegion(regionid);
	}
	//U
	@PutMapping("/actualizar")
	public String updateRegion(Region regionUpdate) {
		return regionServices.updateRegion(regionUpdate);
	}
	//D
	@GetMapping("/borrar/{regionid}")
	public String deleteRegion(@PathVariable Integer regionid) {
		return regionServices.deleteRegion(regionid);
	}
}
