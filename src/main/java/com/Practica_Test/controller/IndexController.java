/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Grupo 6
 * Práctica de examen
 */
package com.Practica_Test.controller;

import com.Practica_Test.domain.Paises;
import com.Practica_Test.service.PaisesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Importar anotaciones Controller,Slf4j
 *
 * @author Brandon R
 */
@Controller
@Slf4j
public class IndexController {

    @Autowired
    private PaisesService paisesService;

    /**
     * Revisar los HTTP Verbs de peticiones, en el paréntesis va una ruta.
     *
     * @param model
     * @return
     */
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizamos MVC");
        var pais = paisesService.getPaises();
        model.addAttribute("Paises", pais);
        return "index";
    }

    @GetMapping("/nuevoPais")
    public String nuevoPais(Paises pais) {
        return "modificarPais";
    }

    @PostMapping("/guardarPais")
    public String guardarPais(Paises pais) {
        paisesService.save(pais);
        return "redirect:/";
    }

    @GetMapping("/modificarPais/{idEstado}")
    public String modificarPais(Paises pais, Model model) {
        pais = paisesService.getPais(pais);
        model.addAttribute("Paises", pais);
        return "modificarPais";
    }

    @GetMapping("/eliminarPais/{idEstado}")
    public String eliminarPais(Paises pais) {
        paisesService.delete(pais);
        return "redirect:/";
    }
}
