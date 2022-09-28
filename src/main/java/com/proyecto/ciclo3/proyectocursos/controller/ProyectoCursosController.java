package com.proyecto.ciclo3.proyectocursos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProyectoCursosController {
    
    @GetMapping("/iniciosesion")
    public String goToInicioSesion(Model model) {
        return "iniciosesion";
    }

    @GetMapping("/catalogoEsp")
    public String goToEspecialidades(Model model) {
        

        return "catalogoEspecialidades";
    }

}
