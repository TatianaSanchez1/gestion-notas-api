package com.gestion_notas_G2.gestion_notas.services;

import com.gestion_notas_G2.gestion_notas.dto.GrupoSimpleDTO;
import com.gestion_notas_G2.gestion_notas.dto.ProfesorDTO;
import com.gestion_notas_G2.gestion_notas.models.Grupo;
import com.gestion_notas_G2.gestion_notas.models.Profesor;
import com.gestion_notas_G2.gestion_notas.repositories.GrupoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service public class GrupoService {
    private GrupoRepository grupoRepository;

    @Autowired
    private ModelMapper modelMapper;

    public GrupoService(GrupoRepository grupoRepository){
        this.grupoRepository = grupoRepository;
    }


    /**
     * Devuelve una lista de grupos que corresponden al profesor especificado.
     *
     * @param idProfesor El ID del profesor para el cual se desean obtener los grupos.
     * @return Una lista de objetos Grupo que corresponden al profesor especificado.
     */
    public List<Grupo> getGruposByProfesor(Long idProfesor)  {
        return this.grupoRepository.findAllByPeriodoAcademico_VigenteAndProfesor_Id(true, idProfesor);
    }


    /**
     * Obtiene la información básica de un grupo dado su código.
     *
     * @param codigoGrupo El código del grupo del que se desea obtener la información.
     * @return Un objeto GrupoSimpleDTO que contiene la información básica del grupo.
     */
    public GrupoSimpleDTO getGrupoByCodigoGrupo(Long codigoGrupo){
        Grupo grupo = this.grupoRepository.findGrupoByCodigoGrupo(codigoGrupo);
        return modelMapper.map(grupo, GrupoSimpleDTO.class);
    }


    /**
     * Obtiene la información del profesor asociado a un grupo dado su código.
     *
     * @param codigoGrupo El código del grupo del que se desea obtener la información del profesor.
     * @return Un objeto ProfesorDTO que contiene la información del profesor asociado al grupo.
     */
    public ProfesorDTO getProfesorByGrupo(Long codigoGrupo) {
        Profesor profesor = this.grupoRepository.findProfesorByGrupo_CodigoGrupo(codigoGrupo);
        return modelMapper.map(profesor, ProfesorDTO.class);
    }
}
