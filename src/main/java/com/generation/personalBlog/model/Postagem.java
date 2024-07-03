package com.generation.personalBlog.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "tb_postagens")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O Atributo Título é obrigatório!")
    @Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo" +
            "05 e no máximo 100 caracteres")
    private String titulo;

    @NotBlank(message = "O Atributo Texto é obrigatório!")
    @Size(min = 10, max = 1000, message = "O atributo título deve conter no mínimo" +
            "10 e no máximo 1000 caracteres")
    private String texto;

    @UpdateTimestamp
    private LocalDateTime data;

}
