package com.sebasoft.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

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

	@GetMapping(path = "/app/usuarios/{id}")
	public Optional<usuarioModel> findById(@PathVariable("id") Long id) {
		return usuario.findById(id);
	}

	@GetMapping(path = "/app/usuarios/query/{email}")
	public ArrayList<usuarioModel> findByEmail(@PathVariable("email") String email) {
		return usuario.findByEmail(email);
	}

	@DeleteMapping(path = "/app/usuarios/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		try {
			this.usuario.deleteById(id);
			return "Usuario eliminado";
		} catch (Exception e) {
			return e.getMessage();
		}

	}
}
