package com.gestion_notas_G2.gestion_notas.models;

import javax.persistence.*;

@Entity
@Table(name = "matricula")
public class Matricula {

    @Id
    @Column(name = "id_matricula", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatricula;
    @ManyToOne
    private Estudiante estudiante;
    @ManyToOne
    private Grupo grupo;

    public Matricula() {
    }

    public Matricula(Long idMatricula, Estudiante estudiante, Grupo grupo) {
        this.idMatricula = idMatricula;
        this.estudiante = estudiante;
        this.grupo = grupo;
    }

    public Long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}

