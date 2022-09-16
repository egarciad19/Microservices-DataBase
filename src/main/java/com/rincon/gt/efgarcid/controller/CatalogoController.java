/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.controller;

import com.rincon.gt.efgarcid.models.CatalogoModel;
import com.rincon.gt.efgarcid.service.CatalogoService;
import io.swagger.annotations.Api;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author egarc
 */

@Api
@RestController
@RequestMapping("/catalogo")
@CrossOrigin(origins = "http://localhost:4200")
public class CatalogoController {
    @Autowired
    private CatalogoService service;
    /*metodo de prueba*/
    @GetMapping("/general")
    public List<CatalogoModel> prueba() {
        return this.service.obtenerCatalogo();
    }
}
