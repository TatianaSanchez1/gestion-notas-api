package com.gestion_notas_G2.gestion_notas.services;

import com.gestion_notas_G2.gestion_notas.models.Grupo;
import com.gestion_notas_G2.gestion_notas.repositories.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service public class GrupoService {
    private GrupoRepository grupoRepository;

    public GrupoService(GrupoRepository grupoRepository){
        this.grupoRepository = grupoRepository;
    }

    public List<Grupo> getGruposByProfesor(Long idProfesor) throws Exception {
        return this.grupoRepository.findAllByPeriodoAcademico_VigenteAndProfesor_Id(true, idProfesor);
    }
}
