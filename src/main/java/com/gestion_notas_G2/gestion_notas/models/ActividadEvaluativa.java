package com.gestion_notas_G2.gestion_notas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "evaluacion")
public class ActividadEvaluativa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String concepto;
    @Column(nullable = false)
    private int porcentaje;
    @ManyToOne
    private Grupo grupo;
    @OneToMany(mappedBy = "actividadEvaluativa")
    @JsonIgnore
    private List<NotaActividad> notaActividades;

    public ActividadEvaluativa() {
    }

    public ActividadEvaluativa(Long id, String concepto, int porcentaje, Grupo grupo, List<NotaActividad> notaActividades) {
        this.id = id;
        this.concepto = concepto;
        this.porcentaje = porcentaje;
        this.grupo = grupo;
        this.notaActividades = notaActividades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public List<NotaActividad> getNotaActividades() {
        return notaActividades;
    }

    public void setNotaActividades(List<NotaActividad> notaActividades) {
        this.notaActividades = notaActividades;
    }
}

