package com.indra.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping(value="/Home")
public class requestcontroler {
	//http://localhost:8080/Home/crear
	@GetMapping("/crear")
	public String Create() {
		return "Aqui es donde creo" ;
	}
	
	//http://localhost:8080/Home/leer
	@PostMapping("/leer")
	public String Read() {
		return "Aqui se lee" ;
	}
	
	//http://localhost:8080/Home/actualizar
	@GetMapping("/actualizar")
	public String Update() {
		return "Aqui se actualiza";
	}
	
	//http://localhost:8080/Home/borrar
	@GetMapping("/borrar")
	public String DELETE() {
		return "Aqui se borra";
	}
}
