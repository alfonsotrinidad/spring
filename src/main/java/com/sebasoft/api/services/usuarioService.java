package com.sebasoft.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebasoft.api.models.usuarioModel;
import com.sebasoft.api.repositories.usuarioRepository;

@Service
public class usuarioService {

	@Autowired
	usuarioRepository user;

	public ArrayList<usuarioModel> findAll() {
		return (ArrayList<usuarioModel>) user.findAll();
	}

	public usuarioModel save(usuarioModel usuario) {
		return user.save(usuario);
	}

	public Optional<usuarioModel> findById(Long id) {
		return user.findById(id);
	}

	public ArrayList<usuarioModel> findByEmail(String email) {
		return user.findByEmail(email);
	}

	public void deleteById(int id) {

		user.deleteById(id);

	}

}
