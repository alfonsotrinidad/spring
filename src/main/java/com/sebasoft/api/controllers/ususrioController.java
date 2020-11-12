package com.sebasoft.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebasoft.api.services.usuarioService;



@RestController
@RequestMapping
public class ususrioController {
	
	@Autowired
	usuarioService usuario;
	
	
	

	 @GetMapping("/app")
	    String usuarios() 
	    {
	        return "Bienvenidos";
	    }
	
	
}
