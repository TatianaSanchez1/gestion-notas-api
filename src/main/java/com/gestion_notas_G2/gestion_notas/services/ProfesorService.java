package com.gestion_notas_G2.gestion_notas.services;

import com.gestion_notas_G2.gestion_notas.models.Profesor;
import com.gestion_notas_G2.gestion_notas.repositories.ProfesorRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {
    private ProfesorRespository profesorRespository;

    public ProfesorService(ProfesorRespository profesorRespository){
        this.profesorRespository = profesorRespository;
    }

    public List<Profesor> getProfesores(){
        return profesorRespository.findAll();
    }

    public Profesor postProfesor(Profesor profesor){
        return profesorRespository.save(profesor);
    }

}
