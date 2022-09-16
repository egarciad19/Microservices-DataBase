/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.service;

import com.rincon.gt.efgarcid.dto.UsuarioActualizaDto;
import com.rincon.gt.efgarcid.dto.UsuarioDto;
import com.rincon.gt.efgarcid.models.UsuarioModel;
import com.rincon.gt.efgarcid.repository.UsuarioRepository;
import java.util.Optional;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author egarc
 */
@Service
public class UsuarioService {

    Logger logger = Logger.getLogger("My Logs efgarcid");

    @Autowired
    private UsuarioRepository repository;

    public Optional<UsuarioModel> obtenerUsuario(Integer codigo, String pass) {
        Optional<UsuarioModel> datos = this.repository.
                obtenerUsuarioByCodigoAndPassword(codigo, pass);
        return datos;
    }

    public Boolean crearUsuario(UsuarioDto usuario) {
        try {
            this.repository.save(new UsuarioModel(usuario));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean actualizaUsuario(UsuarioActualizaDto usuario) {
        try {
            Optional<UsuarioModel> existeUsuario = this.repository.findById(usuario.getCodigoUsuario());
            if (existeUsuario.isPresent()) {
                this.repository.save(new UsuarioModel(usuario));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
}
