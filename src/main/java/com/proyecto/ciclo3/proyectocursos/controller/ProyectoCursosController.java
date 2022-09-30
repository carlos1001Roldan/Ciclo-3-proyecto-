package com.proyecto.ciclo3.proyectocursos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.ciclo3.proyectocursos.controller.service.EspecialidadService;

@Controller
public class ProyectoCursosController {

    private EspecialidadService especialidadService;

    public ProyectoCursosController(EspecialidadService especialidadService) {
        this.especialidadService = especialidadService;
    }
    
    @GetMapping("/iniciosesion")
    public String goToInicioSesion(Model model) {
        return "iniciosesion";
    }

    @GetMapping("/catalogoEsp")
    public String goToEspecialidades(Model model) {
        
        var especialidades = this.especialidadService.getEspecialidades();

        model.addAttribute("especialidades", especialidades);
        
        return "catalogoEspecialidades";
    }
}
