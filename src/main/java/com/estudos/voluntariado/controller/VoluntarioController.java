package com.estudos.voluntariado.controller;

import com.estudos.voluntariado.service.VoluntarioService;
import com.estudos.voluntariado.entity.Voluntario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/voluntario")
public class VoluntarioController {

    @Autowired
    VoluntarioService personService;

    @GetMapping
    public String formVoluntario(){

        return "formVoluntario";
    }

    @PostMapping("/save")
    public void cadastrar(@Valid Voluntario voluntario){

        personService.cadastrar(voluntario);
    }

}
