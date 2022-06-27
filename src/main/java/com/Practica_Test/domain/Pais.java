/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Grupo 6
 * Práctica de examen
 */
package com.Practica_Test.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Brandon R
 */
@Data
@Entity
@Table(name = "estado")
public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado; //id_estado
    String nombre;
    String capital;
    String habitantes;
    String continente;

    public Pais() {
        
    }

    public Pais(String nombre, String capital, String habitantes, String continente) {
        this.nombre = nombre;
        this.capital = capital;
        this.habitantes = habitantes;
        this.continente = continente;
    }
}
