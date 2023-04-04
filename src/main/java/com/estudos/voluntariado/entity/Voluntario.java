package com.estudos.voluntariado.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Voluntario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Nome deve ser preenchido")
    @Column(nullable = false)
    private String nome;

    @CPF @Column(nullable = false)
    private String cpf;

    @Email @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private LocalDate dtNasc;

}
