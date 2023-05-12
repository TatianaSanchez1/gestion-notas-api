package com.gestion_notas_G2.gestion_notas.dto;

public class PeriodoAcademicoDTO {
    private String nombre;

    public PeriodoAcademicoDTO(String nombre) {
        this.nombre = nombre;
    }

    public PeriodoAcademicoDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
