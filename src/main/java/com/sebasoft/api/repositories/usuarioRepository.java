package com.sebasoft.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sebasoft.api.models.usuarioModel;

@Repository
public interface usuarioRepository extends CrudRepository<usuarioModel, Long> {

}
