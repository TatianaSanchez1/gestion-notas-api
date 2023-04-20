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

    public List<ActividadEvaluativa> getActividadesEvaluativas() throws Exception {
        Optional<List<ActividadEvaluativa>> optionalActividadEvaluativas = Optional.ofNullable(this.actividadEvaluativaRepository.findAll());
        if (optionalActividadEvaluativas.isPresent()) {
            return optionalActividadEvaluativas.get();
        } else {
            throw new Exception("No se encontraron Actividades Evalautivas");
        }
    }

    public List<ActividadEvaluativa> getActividadesEvaluativasByGrupo(String codigoGrupo) throws Exception {
        Optional<List<ActividadEvaluativa>> optionalActividadEvaluativas = Optional.ofNullable(this.actividadEvaluativaRepository.findActividadEvaluativaByGrupo_CodigoGrupo(codigoGrupo));
        if (optionalActividadEvaluativas.isPresent()) {
            return optionalActividadEvaluativas.get();
        } else {
            throw new Exception("No se encontraron Actividades Evalautivas");
        }
    }

    public ActividadEvaluativa postActividadEvaluativa(ActividadEvaluativa actividadEvaluativa) throws Exception {
        Optional<ActividadEvaluativa> optionalActividadEvaluativa = Optional.ofNullable(this.actividadEvaluativaRepository.save(actividadEvaluativa));
        if (optionalActividadEvaluativa.isPresent()) {
            return optionalActividadEvaluativa.get();
        } else {
            throw new Exception("Error al guardar en la base de datos");
        }
    }

    public List<ActividadEvaluativa> postActividadesEvaluativas(List<ActividadEvaluativa> actividadEvaluativaList) throws Exception {
        Optional<List<ActividadEvaluativa>> optionalActividadEvaluativas = Optional.ofNullable(this.actividadEvaluativaRepository.saveAll(actividadEvaluativaList));
        if (optionalActividadEvaluativas.isPresent()) {
            return optionalActividadEvaluativas.get();
        } else {
            throw new Exception("Error al guardar en la base de datos");
        }
    }


}
