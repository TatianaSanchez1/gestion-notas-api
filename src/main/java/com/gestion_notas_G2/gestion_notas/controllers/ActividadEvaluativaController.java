package com.gestion_notas_G2.gestion_notas.controllers;

import com.gestion_notas_G2.gestion_notas.models.ActividadEvaluativa;
import com.gestion_notas_G2.gestion_notas.services.ActividadEvaluativaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ActividadEvaluativaController {

    private ActividadEvaluativaService actividadEvaluativaService;

    public ActividadEvaluativaController(ActividadEvaluativaService actividadEvaluativaService) {
        this.actividadEvaluativaService = actividadEvaluativaService;
    }

    @GetMapping("api/actividades_evaluativas/")
    public ResponseEntity<Object> getActividadEvaluativaList(){
        try {
            List<ActividadEvaluativa> actividadEvaluativaList = actividadEvaluativaService.getActividadEvaluativaList();
            return new ResponseEntity<>(actividadEvaluativaList, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("api/{codigoGrupo}/actividades_evaluativas/")
    public ResponseEntity<Object> getActividadEvaluativaListByGrupo(@PathVariable String codigoGrupo) {
        try {
            List<ActividadEvaluativa> actividadEvaluativaList = actividadEvaluativaService.getActividadEvaluativaListByGrupo(codigoGrupo);
            return new ResponseEntity<>(actividadEvaluativaList, HttpStatus.OK);

        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("api/{codigoGrupo}/actividades_evaluativas/")
    public ResponseEntity<Object> postActividadEvaluativaList(@RequestBody List<ActividadEvaluativa> actividadEvaluativaList, @PathVariable String codigoGrupo) {
        try {
            List<ActividadEvaluativa> actividadEvaluativas = this.actividadEvaluativaService.postActivadEvaluativaList(actividadEvaluativaList, codigoGrupo);
            return new ResponseEntity<>(actividadEvaluativas, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
