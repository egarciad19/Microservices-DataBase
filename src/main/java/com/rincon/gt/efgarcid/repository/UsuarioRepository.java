/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.repository;

import com.rincon.gt.efgarcid.models.UsuarioModel;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author egarc
 */
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {
    
    /*Obtener datos de usuario por codigo y contraseña*/
    @Query(value = "select * from bd_rincon_gt.bd_usuario bu \n"
            + "where bu.codigo_usuario = :codigoUsuario and bu.password_usuario = :passUsuario",
            nativeQuery = true)
    Optional<UsuarioModel> obtenerUsuarioByCodigoAndPassword(@Param("codigoUsuario") Integer codigoUsuario,
            @Param("passUsuario") String passUsuario);
    
}
