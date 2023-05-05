package com.gestion_notas_G2.gestion_notas.services;

import com.gestion_notas_G2.gestion_notas.models.Profesor;
import com.gestion_notas_G2.gestion_notas.repositories.ProfesorRespository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProfesorServiceTest {

    @Mock
    private ProfesorRespository ProfesorRepository;
    @InjectMocks
    private ProfesorService profesorService;

    private Profesor profesor;
    private List<Profesor> profesorList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        profesor = new Profesor(1L,"Pedro","Paternina","mail@profesor.edu.co",
                "856932145", "mail@institucional.com","3259684751",null,null);
        profesorList = Collections.singletonList(profesor);
    }

    @Test
    void getProfesores() {
        when(ProfesorRepository.findAll()).thenReturn(profesorList);
        List<Profesor> expected = profesorList;
        List<Profesor> result = profesorService.getProfesores();
        assertEquals(expected,result);
    }

    @Test
    void postProfesor() throws Exception {
        when(ProfesorRepository.save(profesor)).thenReturn(profesor);
        String result = profesorService.postProfesor(profesor);
        String expect = "Profesor creado exitosamente";
        assertEquals(expect,result);
    }

    @Test
    void postProfesorException() throws Exception {
        when(ProfesorRepository.save(profesor)).thenThrow(new RuntimeException("Error al crear el profesor"));
        Exception exception = assertThrows(Exception.class, () -> {
            profesorService.postProfesor(profesor);
        });
        String expect = "Error al crear el profesor";
        assertEquals(expect, exception.getMessage());
        assertFalse(ProfesorRepository.existsById(profesor.getId()));
    }

}