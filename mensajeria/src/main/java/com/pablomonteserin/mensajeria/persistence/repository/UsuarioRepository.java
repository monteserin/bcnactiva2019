package com.pablomonteserin.mensajeria.persistence.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.pablomonteserin.mensajeria.persistence.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	@Query("SELECT u FROM Usuario u WHERE u.nombre=:nombre AND u.password=:password")
	Usuario findUsuario(@Param("nombre")String nombre, @Param("password")String password );
}
