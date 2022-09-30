package com.proyecto.ciclo3.proyectocursos.controller.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.ciclo3.proyectocursos.controller.dto.EspecialidadDto;
import com.proyecto.ciclo3.proyectocursos.controller.service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService{
    
    private final List<EspecialidadDto> especialidades = Arrays.asList(
        new EspecialidadDto("Desarrollo Android", "Aprende a desarollar web de la mejor manera", 1),
        new EspecialidadDto("Desarrollo Movil", "Se uno de los mejores desarrolladores moviles!!", 2),
        new EspecialidadDto("Mercadeo Digital", "Desarrolla nuevas habilidades de marketing", 3),
        new EspecialidadDto("Frontend", "Desarrolla excelentes interfaces para tus clientes", 4),
        new EspecialidadDto("Backend", "Aprende y entiende toda la lógica que hay detrás", 5),
        new EspecialidadDto("Diseño de interfaces","Diseña y maqueta hermosas interfaces" , 6)
        );

    @Override
    public List<EspecialidadDto> getEspecialidades() {
        return especialidades;
    }


}
