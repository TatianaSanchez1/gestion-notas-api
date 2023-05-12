package com.gestion_notas_G2.gestion_notas.dto;

import lombok.Data;

@Data
public class GrupoSimpleDTO {
    private CursoSimpleDTO curso;
    private PeriodoAcademicoDTO periodoAcademico;
    private String nombreGrupo;
    private String horario;
    private String aula;
    private int totalEstudiantes;
}
