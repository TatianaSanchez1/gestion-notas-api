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
    public ResponseEntity<Object> getActividadesEvaluativas(){
        try {
            List<ActividadEvaluativa> actividadEvaluativaList = actividadEvaluativaService.getActividadesEvaluativas();
            return new ResponseEntity<>(actividadEvaluativaList, HttpStatus.OK);

        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("api/{codigoGrupo}/actividades_evaluativas/")
    public ResponseEntity<Object> getActividadesEvaluativasByGrupo(@PathVariable String codigoGrupo) {
        try {
            List<ActividadEvaluativa> actividadEvaluativaList = actividadEvaluativaService.getActividadesEvaluativasByGrupo(codigoGrupo);
            return new ResponseEntity<>(actividadEvaluativaList, HttpStatus.OK);

        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("api/actividades_evaluativas/")
    public ResponseEntity<Object> postActividadesEvaluativas(@RequestBody List<ActividadEvaluativa> actividadEvaluativaList) {
        try {
            List<ActividadEvaluativa> actividadEvaluativas = this.actividadEvaluativaService.postActividadesEvaluativas(actividadEvaluativaList);
            return new ResponseEntity<>(actividadEvaluativas, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
