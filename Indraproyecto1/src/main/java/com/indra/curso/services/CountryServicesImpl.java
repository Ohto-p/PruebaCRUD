package com.indra.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.curso.repository.CountryRepository;
import com.indra.curso.entity.Country;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServicesImpl implements CountryServices {
	
	@Autowired
	CountryRepository countryRepository;
	
	public List<Country> findAllCountries() {
		return countryRepository.findAll();
	}
	
	public Optional<Country> findCountryById(String countryid){
		Optional <Country> country = countryRepository.findById(countryid);
		return country;
	}
	
	public Country saveCountry(Country countryNew) {
			return countryRepository.save(countryNew);
	}
	
	
}
