package com.gestion_notas_G2.gestion_notas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persona")
public class Profesor extends Persona {
    @OneToMany(mappedBy = "profesor")
    @JsonIgnore
    private List<Grupo> grupos;

    public Profesor() {
    }

    public Profesor(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Profesor(Long id, String nombre, String apellido, String correo, String numDocumento, String correoInstitucional, String telefono, Usuario usuario, List<Grupo> grupos) {
        super(id, nombre, apellido, correo, numDocumento, correoInstitucional, telefono, usuario);
        this.grupos = grupos;
    }
    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

}
