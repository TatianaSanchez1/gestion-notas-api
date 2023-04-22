package com.gestion_notas_G2.gestion_notas.services;

import com.gestion_notas_G2.gestion_notas.models.ActividadEvaluativa;
import com.gestion_notas_G2.gestion_notas.repositories.ActividadEvaluativaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActividadEvaluativaService {
    private ActividadEvaluativaRepository actividadEvaluativaRepository;

    public ActividadEvaluativaService(ActividadEvaluativaRepository actividadEvaluativaRepository) {
        this.actividadEvaluativaRepository = actividadEvaluativaRepository;
    }

    public List<ActividadEvaluativa> getActividadEvaluativaList()  {
        return this.actividadEvaluativaRepository.findAll();
    }

    public List<ActividadEvaluativa> getActividadEvaluativaListByGrupo(String codigoGrupo) {
        return this.actividadEvaluativaRepository.findAllByGrupo_CodigoGrupo(codigoGrupo);
    }
    public List<ActividadEvaluativa> postActivadEvaluativaList(List<ActividadEvaluativa> actividadEvaluativaList, String codigoGrupo) throws Exception {
        List<ActividadEvaluativa> actividadEvaluativas = this.actividadEvaluativaRepository.findAllByGrupo_CodigoGrupo(codigoGrupo);
        if(actividadEvaluativas.isEmpty()){
            try {
                return this.actividadEvaluativaRepository.saveAll(actividadEvaluativaList);
            } catch (Exception e){
                throw new Exception("Ha ocurrido un error al guardar los datos");
            }
        }
        else {
            try {
                actividadEvaluativas.removeIf(evaluacion -> actividadEvaluativaList.contains(evaluacion));
                this.actividadEvaluativaRepository.deleteAll(actividadEvaluativas);
                return this.actividadEvaluativaRepository.saveAll(actividadEvaluativaList);
            }catch (Exception e){
                throw new Exception("Ha ocurrido un error al guardar los datos");
            }
        }
    }
}
