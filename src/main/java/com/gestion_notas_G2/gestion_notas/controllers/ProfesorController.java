package com.gestion_notas_G2.gestion_notas.controllers;

import com.gestion_notas_G2.gestion_notas.models.Profesor;
import com.gestion_notas_G2.gestion_notas.services.ProfesorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Object> getProfesores(){
        try {
            List<Profesor> profesorList = this.profesorService.getProfesores();
            return new ResponseEntity<>(profesorList, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/api/profesores")
    public ResponseEntity<Object> postProfesor(@RequestBody Profesor profesor){
        try {
            Profesor newProfesor = this.profesorService.postProfesor(profesor);
            return new ResponseEntity<>(newProfesor, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
