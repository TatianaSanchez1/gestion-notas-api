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

    public List<Grupo> getGrupos() throws Exception {
        Optional<List<Grupo>> optionalGrupos = Optional.ofNullable(this.grupoRepository.findAll());
        if(optionalGrupos.isPresent()){
            return optionalGrupos.get();
        }else{
            throw new Exception("No se encontraron Grupos");
        }
    }

    public List<Grupo> getGruposByProfesor(Long idProfesor) throws Exception {
        Optional<List<Grupo>> optionalGrupos = Optional.ofNullable(this.grupoRepository.findGrupoByPeriodoAcademico_VigenteAndProfesor_Id(true, idProfesor));
        if(optionalGrupos.isPresent()){
            return optionalGrupos.get();
        }else{
            throw  new Exception("No se encontraron grupos");
        }
    }
}
