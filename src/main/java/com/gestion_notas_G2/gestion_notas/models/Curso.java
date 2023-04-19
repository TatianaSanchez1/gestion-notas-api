package com.gestion_notas_G2.gestion_notas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @Column(name = "codigo_curso", nullable = false, updatable = false)
    private String codigoCurso;
    @Column(name = "nombre_curso")
    private String nombreCurso;
    @Column(nullable = false)
    private String pensum;
    @Column(nullable = false)
    private int creditos;
    @OneToMany(mappedBy = "curso")
    @JsonIgnore
    private List<Grupo> grupos;

    public Curso() {
    }

    public Curso(String codigoCurso, String nombreCurso, String pensum, int creditos, List<Grupo> grupos) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.pensum = pensum;
        this.creditos = creditos;
        this.grupos = grupos;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getPensum() {
        return pensum;
    }

    public void setPensum(String pensum) {
        this.pensum = pensum;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}
