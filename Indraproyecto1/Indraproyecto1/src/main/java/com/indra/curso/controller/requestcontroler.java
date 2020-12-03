package com.indra.curso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
public class requestcontroler {
	//Http://localhost:8080/GET
	@RequestMapping(value="/get", method = RequestMethod.GET)
	@ResponseBody
	public String get() {
		return "Aqui leo";
	}
	
	//Http://localhost:8080/POST
	@RequestMapping(value="/post", method = RequestMethod.POST)
	@ResponseBody
	public void post() {
		System.out.print("hola con post") ;
	}
	//Http://localhost:8080/PUT
	@RequestMapping(value="/put", method = RequestMethod.PUT)
	@ResponseBody
	public void put() {
		System.out.print("Aqui Actualizo") ;
	}
	//Http://localhost:8080/DELETE
	@RequestMapping(value="/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete() {
		System.out.print("Aqui Borro") ;
	}
}
