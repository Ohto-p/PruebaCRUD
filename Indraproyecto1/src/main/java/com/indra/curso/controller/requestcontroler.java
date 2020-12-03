package com.indra.curso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller 
public class requestcontroler {
	//Http://localhost:8080/GET
	@RequestMapping(value="/get", method = RequestMethod.GET)
	
	public String get() {
		return "Aqui leo";
	}
	
	//Http://localhost:8080/POST
	@RequestMapping(value="/post", method = RequestMethod.POST)
	public void post() {
		System.out.print("hola con post") ;
	}
	//Http://localhost:8080/PUT
	@RequestMapping(value="/put", method = RequestMethod.PUT)
	public void put() {
		System.out.print("Aqui Actualizo") ;
	}
	//Http://localhost:8080/DELETE
	@RequestMapping(value="/delete", method = RequestMethod.DELETE)
	public void delete() {
		System.out.print("Aqui Borro") ;
	}
}
