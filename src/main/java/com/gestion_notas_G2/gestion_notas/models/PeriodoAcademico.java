package com.gestion_notas_G2.gestion_notas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "periodo_academico")
public class PeriodoAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private boolean vigente;

    @OneToMany(mappedBy = "periodoAcademico", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Grupo> grupos;

    public PeriodoAcademico() {
    }

    public PeriodoAcademico(Long id, String nombre, boolean vigente, List<Grupo> grupos) {
        this.id = id;
        this.nombre = nombre;
        this.vigente = vigente;
        this.grupos = grupos;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
}

