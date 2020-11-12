package com.sebasoft.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import com.sebasoft.api.models.usuarioModel;
import com.sebasoft.api.services.usuarioService;

@RestController
@RequestMapping
public class ususrioController {

	@Autowired
	usuarioService usuario;

	@PostMapping("/app/usuarios/save")
	public usuarioModel save(@RequestBody usuarioModel usuario) {
		return this.usuario.save(usuario);
	}

	public String toString() {
		return usuario.toString();
	}

	@GetMapping("/app/usuarios")
	public ArrayList<usuarioModel> usuarios() {
		return usuario.findAll();
	}
}