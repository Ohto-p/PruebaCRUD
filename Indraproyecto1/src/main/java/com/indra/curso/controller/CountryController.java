package com.indra.curso.controller;

import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Country;

public interface CountryController {
	
		//C
		public Country addController(Country country);
		//R
		public List<Country> getCountries();
		//U
		public Optional<Country> FindById(String countryid );
		//D
		
}
