/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.service;

import com.rincon.gt.efgarcid.models.CatalogoModel;
import com.rincon.gt.efgarcid.repository.CatalogoRepository;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author egarc
 */
@Service
public class CatalogoService {
    Logger logger = Logger.getLogger("Logs de Catalogo");
    
    @Autowired
    private CatalogoRepository repository;
    
    /*Obtiene todos los datos de catalogo*/
    public List<CatalogoModel> obtenerCatalogo() {
        List<CatalogoModel> datos = this.repository.findAll();
        return datos;
    }
    
}
