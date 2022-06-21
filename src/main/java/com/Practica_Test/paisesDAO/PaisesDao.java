/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Grupo 6
 * Práctica de examen
 */
package com.Practica_Test.paisesDAO;

import com.Practica_Test.domain.Paises;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Brandon R
 */
public interface PaisesDao extends CrudRepository<Paises, Long>{
    
}
