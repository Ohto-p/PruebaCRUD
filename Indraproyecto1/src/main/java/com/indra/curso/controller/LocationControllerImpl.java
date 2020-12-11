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

import com.indra.curso.entity.Location;
import com.indra.curso.services.LocationServices;

@RestController
@RequestMapping("/home/location")
public class LocationControllerImpl {
	
	@Autowired
	LocationServices locationServices;
	
	//C
	@PostMapping("/add")
	public String addLocation(Location locationNew) {
		return locationServices.addLocation(locationNew);
	}
	//R
	@GetMapping("/ver")
	public List<Location> findallLocation(){
		return locationServices.findAllLocation();
	}
	@GetMapping("/ver/{locationid}")
	public Optional<Location> findByIdLocation(@PathVariable Integer locationid){
		return locationServices.findByIdLocation(locationid);
	}
	//U
	@PutMapping("/actualizar")
	public String updateLocation(Location locationUpdate) {
		return locationServices.updateLocation(locationUpdate);
	}
	//D
	@GetMapping("/borrar/{locationid}")
	public String deleteLocation(@PathVariable Integer locationid) {
		return locationServices.deleteLocation(locationid);
	}
}
