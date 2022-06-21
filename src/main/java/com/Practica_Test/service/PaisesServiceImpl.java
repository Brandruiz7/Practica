/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Grupo 6
 * Práctica de examen
 */
package com.Practica_Test.service;


import com.Practica_Test.domain.Paises;
import com.Practica_Test.paisesDAO.PaisesDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Brandon R
 */
@Service
public class PaisesServiceImpl implements PaisesService {

    @Autowired
    private PaisesDao PaisesDao;

    //Los que son de lectura @Transactional(readOnly = true) y sino normal.
    
    @Override
    @Transactional(readOnly = true)
    public List<Paises> getPaises() {
        return (List<Paises>) PaisesDao.findAll();
    }

    /**
     * Buscamos un registro de un cliente y si no encuentra devuelve null.
     *
     * @param pais
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Paises getPais(Paises pais) {
        return PaisesDao.findById(pais.getIdEstado()).orElse(null);
    }

    /**
     * Para guardar o sobreescribir
     *
     * @param pais
     */
    @Override
    @Transactional
    public void save(Paises pais) {
        PaisesDao.save(pais);
    }

    /**
     * Para borrar datos.
     *
     * @param pais
     */
    @Override
    @Transactional
    public void delete(Paises pais) {
        PaisesDao.delete(pais);
    }
}