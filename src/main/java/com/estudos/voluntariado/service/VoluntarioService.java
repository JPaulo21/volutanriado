package com.estudos.voluntariado.service;

import com.estudos.voluntariado.entity.Voluntario;
import com.estudos.voluntariado.repository.VoluntarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoluntarioService {

    @Autowired
    VoluntarioRepository pessoaRepository;

    public void cadastrar(Voluntario pessoa){

        pessoaRepository.save(pessoa);
    }

}
