/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Grupo 6
 * Práctica de examen
 */
package com.Practica_Test.PaisDAO;

import com.Practica_Test.domain.Pais;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Brandon R
 */
public interface PaisDao extends CrudRepository<Pais, Long>{
    
}
