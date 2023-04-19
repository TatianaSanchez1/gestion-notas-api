package com.gestion_notas_G2.gestion_notas.controllers;

import com.gestion_notas_G2.gestion_notas.models.Profesor;
import com.gestion_notas_G2.gestion_notas.services.ProfesorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfesorController {
    private ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService){
        this.profesorService = profesorService;
    }

    @GetMapping("/api/profesores")
    public List<Profesor> getProfesores(){
        return this.profesorService.getProfesores();
    }

    @PostMapping("/api/profesores")
    public Profesor postProfesor(@RequestBody Profesor profesor){
        return this.profesorService.postProfesor(profesor);
    }
}
