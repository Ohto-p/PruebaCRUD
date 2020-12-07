package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.curso.entity.Country;
import com.indra.curso.services.CountryServices;

@RestController
@RequestMapping(value = "/home/country")
public class CountryControllerlmpl {
	
	@Autowired
	CountryServices countryService;
	
	//Create
	@PostMapping("/add")
	public Country saveCountry(Country country) {
		return countryService.saveCountry(country);
	}
	
	//Read all or only one
	
	//home/country/ver
	@GetMapping("/ver")
	public List<Country> findAllCountries(){
		return countryService.findAllCountries();	
	}
	//home/country/ver/AR
	@GetMapping("/ver/{countryid}")
	public Optional<Country> findCountryById(@PathVariable String countryid){
		return countryService.findCountryById(countryid);	
	}
	
	//Update
	//Delete only one
	

}
