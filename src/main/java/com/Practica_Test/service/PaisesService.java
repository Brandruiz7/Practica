/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Grupo 6
 * Práctica de examen
 */
package com.Practica_Test.service;

import com.Practica_Test.domain.Paises;
import java.util.List;

/**
 *
 * @author Brandon R
 */
public interface PaisesService {

    public List<Paises> getPaises();

    public Paises getPais(Paises pais);

    public void save(Paises pais);

    public void delete(Paises pais);
}
