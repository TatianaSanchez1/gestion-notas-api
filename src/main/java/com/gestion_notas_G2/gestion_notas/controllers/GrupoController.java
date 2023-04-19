package com.gestion_notas_G2.gestion_notas.controllers;

import com.gestion_notas_G2.gestion_notas.models.Grupo;
import com.gestion_notas_G2.gestion_notas.services.GrupoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class GrupoController {

    private GrupoService grupoService;
    public GrupoController(GrupoService grupoService){
       this.grupoService = grupoService;
    }

    @GetMapping("api/grupos")
    public ResponseEntity<Object> getGrupos(){
        try {
            List<Grupo> grupos = grupoService.getGrupos();
            return new ResponseEntity<>(grupos, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/{id}/grupos/")
    public ResponseEntity<Object> getGruposByProfesor(@PathVariable Long id){
        try {
            List<Grupo> grupos = grupoService.getGruposByProfesor(id);
            return new ResponseEntity<>(grupos, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
