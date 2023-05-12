package com.gestion_notas_G2.gestion_notas.dto;

public class GrupoSimpleDTO {
    private CursoSimpleDTO curso;
    private PeriodoAcademicoDTO periodoAcademico;
    private String nombreGrupo;
    private String horario;
    private String aula;
    private int totalEstudiantes;

    public GrupoSimpleDTO() {
    }

    public GrupoSimpleDTO(CursoSimpleDTO curso, PeriodoAcademicoDTO periodoAcademico, String nombreGrupo, String horario, String aula, int totalEstudiantes) {
        this.curso = curso;
        this.periodoAcademico = periodoAcademico;
        this.nombreGrupo = nombreGrupo;
        this.horario = horario;
        this.aula = aula;
        this.totalEstudiantes = totalEstudiantes;
    }

    public CursoSimpleDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoSimpleDTO curso) {
        this.curso = curso;
    }

    public PeriodoAcademicoDTO getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(PeriodoAcademicoDTO periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void setTotalEstudiantes(int totalEstudiantes) {
        this.totalEstudiantes = totalEstudiantes;
    }
}
