package com.gestion_notas_G2.gestion_notas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_grupo", nullable = false, updatable = false)
    private Long codigoGrupo;
    @Column(nullable = false)
    private String nombreGrupo;
    @Column(nullable = false)
    private String horario;
    @Column(nullable = false)
    private String aula;
    @Column(name = "total_estudiantes", columnDefinition = "int default 0")
    private int totalEstudiantes;
    @ManyToOne
    private Curso curso;
    @ManyToOne
    private PeriodoAcademico periodoAcademico;
    @OneToMany(mappedBy = "grupo")
    @JsonIgnore
    private List<Matricula> matriculas;
    @OneToMany(mappedBy = "grupo")
    @JsonIgnore
    private List<ActividadEvaluativa> actividadesEvaluativas;
    @ManyToOne
    private Profesor profesor;

    public Grupo() {
    }

    public Grupo(Long codigoGrupo, String nombreGrupo, String horario, String aula, Curso curso, PeriodoAcademico periodoAcademico, List<Matricula> matriculas, List<ActividadEvaluativa> actividadesEvaluativas, Profesor profesor) {
        this.codigoGrupo = codigoGrupo;
        this.nombreGrupo = nombreGrupo;
        this.horario = horario;
        this.aula = aula;
        this.totalEstudiantes = 0;
        this.curso = curso;
        this.periodoAcademico = periodoAcademico;
        this.matriculas = matriculas;
        this.actividadesEvaluativas = actividadesEvaluativas;
        this.profesor = profesor;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public PeriodoAcademico getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(PeriodoAcademico periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<ActividadEvaluativa> getActividadesEvaluativas() {
        return actividadesEvaluativas;
    }

    public void setActividadesEvaluativas(List<ActividadEvaluativa> actividadesEvaluativas) {
        this.actividadesEvaluativas = actividadesEvaluativas;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }


    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public Long getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(Long codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }
}
