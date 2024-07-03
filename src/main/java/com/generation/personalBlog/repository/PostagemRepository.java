package com.generation.personalBlog.repository;

import com.generation.personalBlog.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<Postagem,Long> {


    }
