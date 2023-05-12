package com.gestion_notas_G2.gestion_notas.dto;

import lombok.Data;

@Data
public class EstudianteDTO {
    private Long id;
    private String numDocumento;
    private String nombre;
    private String apellido;
    private String correoInstitucional;
    private String seccional;
}
