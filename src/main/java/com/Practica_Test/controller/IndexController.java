/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Grupo 6
 * Práctica de examen
 */
package com.Practica_Test.controller;

import com.Practica_Test.domain.Pais;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.Practica_Test.service.PaisService;

/**
 * Importar anotaciones Controller,Slf4j
 *
 * @author Brandon R
 */
@Controller
@Slf4j
public class IndexController {

    @Autowired
    private PaisService paisService;

    /**
     * Revisar los HTTP Verbs de peticiones, en el paréntesis va una ruta.
     *
     * @param model
     * @return
     */
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizamos MVC");
        var paises = paisService.getPaises();
        model.addAttribute("paises", paises);
        return "Index";
    }

    @GetMapping("/nuevoPais")
    public String nuevoPais(Pais pais) {
        return "modificarPais";
    }

    @PostMapping("/guardarPais")
    public String guardarPais(Pais pais) {
        paisService.save(pais);
        return "redirect:/";
    }

    @GetMapping("/modificarPais/{idEstado}")
    public String modificarPais(Pais pais, Model model) {
        pais = paisService.getPais(pais);
        model.addAttribute("pais", pais);
        return "modificarPais";
    }

    @GetMapping("/eliminarPais/{idEstado}")
    public String eliminarPais(Pais pais) {
        paisService.delete(pais);
        return "redirect:/";
    }
}
