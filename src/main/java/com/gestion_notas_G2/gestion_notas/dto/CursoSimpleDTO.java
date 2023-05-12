package com.gestion_notas_G2.gestion_notas.dto;

public class CursoSimpleDTO {
    private String codigoCurso;
    private String nombreCurso;

    public CursoSimpleDTO() {
    }

    public CursoSimpleDTO(String codigoCurso, String nombreCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
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
}
