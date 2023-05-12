package com.gestion_notas_G2.gestion_notas.repositories;

import com.gestion_notas_G2.gestion_notas.models.Grupo;
import com.gestion_notas_G2.gestion_notas.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
    public List<Grupo> findAllByPeriodoAcademico_VigenteAndProfesor_Id(Boolean vigente, Long id);

    @Query("SELECT g.profesor FROM Grupo g WHERE g.codigoGrupo = :codigoGrupo")
    Profesor findProfesorByGrupo_CodigoGrupo(@Param("codigoGrupo") Long codigoGrupo);

    @Query("SELECT g FROM Grupo g WHERE g.codigoGrupo = :codigoGrupo")
    Grupo findGrupoByCodigoGrupo(@Param("codigoGrupo") Long codigoGrupo);
}
