/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.controller;

import com.rincon.gt.efgarcid.dto.UsuarioActualizaDto;
import com.rincon.gt.efgarcid.dto.UsuarioDto;
import com.rincon.gt.efgarcid.models.UsuarioModel;
import com.rincon.gt.efgarcid.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Optional;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author egarc
 */

@Api
@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")

public class UsuarioController {

    Logger logger = Logger.getLogger("My Logs efgarcid");

    @Autowired
    private UsuarioService service;

    /*metodo de prueba*/
    @RequestMapping(method = RequestMethod.GET)
    public String prueba() {
        return "SERVICIO LEVANTADO";
    }

    /*Metodo para obtener datos por usuario y contraseña*/
    @GetMapping("/datos/{codigoUsuario}/{passWord}")
    @ApiOperation(value = "Obtener Datos de Usuario", notes = "Ruta para logueo")
    public ResponseEntity<Optional<UsuarioModel>> getObtenerUsuario(
            @PathVariable @ApiParam(value = "Codigo Usuario") Integer codigoUsuario,
            @PathVariable @ApiParam(value = "Password") String passWord) {
        try {
            return ResponseEntity.ok(this.service.
                    obtenerUsuario(codigoUsuario, passWord));
        } catch (Exception handlerException) {
            logger.info("Entro a catch");
        }
        return null;
    }

    /*Metodo para crear a un usuario*/
    @PostMapping("/crear/usuario")
    @ApiOperation(value = "Crea un Usuario", notes = "crea un usuario")
    public boolean postCreaSolicitudCotandor(@RequestBody UsuarioDto usuario) {
        try {
            return this.service.crearUsuario(usuario);

        } catch (Exception handlerException) {
            logger.info("Entro a catch");
        }
        return false;
    }

    /*Metodo para actualizar a un usuario*/
    @PutMapping("/actualiza/usuario")
    @ApiOperation(value = "Actualiza Datos de Usuario", notes = "actualiza usuario")
    public boolean putActualizaSolicitudCotandor(@RequestBody UsuarioActualizaDto usuario) {
        try {
            return this.service.actualizaUsuario(usuario);

        } catch (Exception handlerException) {
            logger.info("Entro a catch");
        }
        return false;
    }
}
