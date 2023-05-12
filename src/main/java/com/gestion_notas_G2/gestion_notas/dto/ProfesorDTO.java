package com.gestion_notas_G2.gestion_notas.dto;

public class ProfesorDTO {
    private String numDocumento;
    private String nombre;
    private String apellido;
    private String correoInstitucional;

    public ProfesorDTO() {
    }

    public ProfesorDTO(String numDocumento, String nombre, String apellido, String correoInstitucional) {
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoInstitucional = correoInstitucional;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
}
