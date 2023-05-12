package com.gestion_notas_G2.gestion_notas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "nombre_usuario", unique = true, nullable = false)
    private String nombreUsuario;

    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    @OneToOne
    @JsonIgnore
    private Persona persona;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = EnumRoleName.class, fetch = FetchType.EAGER)
    private List<EnumRoleName> roles;

    public Usuario() {
    }

    public Usuario(Long id, String nombreUsuario, String contrasena, Persona persona, List<EnumRoleName> roles) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.persona = persona;
        this.roles = roles;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<EnumRoleName> getRoles() {
        return roles;
    }

    public void setRoles(List<EnumRoleName> rol) {
        this.roles = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
