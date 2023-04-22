package com.gestion_notas_G2.gestion_notas.repositories;

import com.gestion_notas_G2.gestion_notas.models.ActividadEvaluativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadEvaluativaRepository extends JpaRepository<ActividadEvaluativa, Long> {
    public List<ActividadEvaluativa> findAllByGrupo_CodigoGrupo(String codigoGrupo);
}
