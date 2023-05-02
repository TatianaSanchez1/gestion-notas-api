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


    /**
     * Devuelve una lista de grupos que corresponden al profesor especificado.
     *
     * @param idProfesor El ID del profesor para el cual se desean obtener los grupos.
     * @return Una lista de objetos Grupo que corresponden al profesor especificado.
     * @throws Exception si ocurre algún error al intentar obtener los datos.
     */
    public List<Grupo> getGruposByProfesor(Long idProfesor) throws Exception {
        return this.grupoRepository.findAllByPeriodoAcademico_VigenteAndProfesor_Id(true, idProfesor);
    }
}
