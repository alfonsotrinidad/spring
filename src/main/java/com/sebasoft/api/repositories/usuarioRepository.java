package com.sebasoft.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.sebasoft.api.models.usuarioModel;

@Repository
public interface usuarioRepository extends CrudRepository<usuarioModel, Long> {
    public abstract ArrayList<usuarioModel> findById(long id);
    public abstract ArrayList<usuarioModel> findByEmail(String email);
    public abstract void deleteById(long id);

}
