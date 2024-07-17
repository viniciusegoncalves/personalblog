package com.generation.personalBlog.repository;

import com.generation.personalBlog.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Optional<Usuario> findByUsuario(String usuario);
}
