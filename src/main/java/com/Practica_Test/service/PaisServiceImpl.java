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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.Practica_Test.PaisDAO.PaisDao;


/**
 *
 * @author Brandon R
 */
@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisDao PaisDao;

    //Los que son de lectura @Transactional(readOnly = true) y sino normal.
    
    @Override
    @Transactional(readOnly = true)
    public List<Pais> getPaises() {
        return (List<Pais>) PaisDao.findAll();
    }

    /**
     * Buscamos un registro de un cliente y si no encuentra devuelve null.
     *
     * @param pais
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Pais getPais(Pais pais) {
        return PaisDao.findById(pais.getIdEstado()).orElse(null);
    }

    /**
     * Para guardar o sobreescribir
     *
     * @param pais
     */
    @Override
    @Transactional
    public void save(Pais pais) {
        PaisDao.save(pais);
    }

    /**
     * Para borrar datos.
     *
     * @param pais
     */
    @Override
    @Transactional
    public void delete(Pais pais) {
        PaisDao.delete(pais);
    }
}