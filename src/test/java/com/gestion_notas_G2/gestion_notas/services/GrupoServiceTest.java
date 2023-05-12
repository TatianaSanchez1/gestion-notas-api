package com.gestion_notas_G2.gestion_notas.services;

import com.gestion_notas_G2.gestion_notas.models.Grupo;
import com.gestion_notas_G2.gestion_notas.repositories.GrupoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GrupoServiceTest {

    @Mock
    private GrupoRepository grupoRepository;
    @InjectMocks
    private GrupoService grupoService;
    private Grupo grupo;
    private List<Grupo> grupoList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        grupo = new Grupo(1L, "LM 20-22","Ude@", "25", null, null, null,null,null);
        grupoList = Collections.singletonList(grupo);
    }


    @Test
    void getGruposByProfesor() throws Exception {
        //Arrange: preparación del entorno
        when(grupoRepository.findAllByPeriodoAcademico_VigenteAndProfesor_Id(true, 1L)).thenReturn(grupoList);

        //Act: Ejecución de la acción que se está probando
        List<Grupo> expected = grupoList;
        List<Grupo> result = grupoService.getGruposByProfesor( 1L);

        //Assert: Verificación de que el resultado de la acción es el esperado.
        assertArrayEquals(expected.toArray(), result.toArray());
    }
}