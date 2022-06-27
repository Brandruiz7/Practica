/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Grupo 6
 * Práctica de examen
 */
package com.Practica_Test.service;

import com.Practica_Test.domain.Pais;
import java.util.List;

/**
 *
 * @author Brandon R
 */
public interface PaisService {

    public List<Pais> getPaises();

    public Pais getPais(Pais pais);

    public void save(Pais pais);

    public void delete(Pais pais);
}
