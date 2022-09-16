/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.dto;

import com.rincon.gt.efgarcid.models.UsuarioModel;
import java.util.Date;

/**
 *
 * @author egarc
 */
public class UsuarioDto {
    private Integer codigoUsuario;
    private Integer estado;
    private String nombreUsuario;
    private String passwordUsuario;
    private String correoElectronico;
    private String direccion;
    
    private String usuarioAdiciono;
    private Date fechaAdiciono;
    private String usuarioModifico;
    private Date fechaModifico;
    
    
    public UsuarioDto(UsuarioModel usuario) {
       this.codigoUsuario = usuario.getCodigoUsuario();
        this.estado = usuario.getEstado();
        this.nombreUsuario = usuario.getNombreUsuario();
        this.passwordUsuario = usuario.getPasswordUsuario();
        this.correoElectronico = usuario.getCorreoElectronico();
        this.direccion = usuario.getDireccion();
        this.usuarioAdiciono = usuario.getUsuarioAdiciono();
        this.fechaAdiciono = usuario.getFechaAdiciono();
        this.usuarioModifico = usuario.getUsuarioModifico();
        this.fechaModifico = usuario.getFechaModifico();
    }
    
    public UsuarioDto() {
    }

    public UsuarioDto(Integer codigoUsuario, Integer estado, String nombreUsuario, String passwordUsuario, String correoElectronico, String direccion, String usuarioAdiciono, Date fechaAdiciono, String usuarioModifico, Date fechaModifico) {
        this.codigoUsuario = codigoUsuario;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.usuarioAdiciono = usuarioAdiciono;
        this.fechaAdiciono = fechaAdiciono;
        this.usuarioModifico = usuarioModifico;
        this.fechaModifico = fechaModifico;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuarioAdiciono() {
        return usuarioAdiciono;
    }

    public void setUsuarioAdiciono(String usuarioAdiciono) {
        this.usuarioAdiciono = usuarioAdiciono;
    }

    public Date getFechaAdiciono() {
        return fechaAdiciono;
    }

    public void setFechaAdiciono(Date fechaAdiciono) {
        this.fechaAdiciono = fechaAdiciono;
    }

    public String getUsuarioModifico() {
        return usuarioModifico;
    }

    public void setUsuarioModifico(String usuarioModifico) {
        this.usuarioModifico = usuarioModifico;
    }

    public Date getFechaModifico() {
        return fechaModifico;
    }

    public void setFechaModifico(Date fechaModifico) {
        this.fechaModifico = fechaModifico;
    }

    @Override
    public String toString() {
        return "UsuarioDto{" + "codigoUsuario=" + codigoUsuario + ", estado=" + estado + ", nombreUsuario=" + nombreUsuario + ", passwordUsuario=" + passwordUsuario + ", correoElectronico=" + correoElectronico + ", direccion=" + direccion + ", usuarioAdiciono=" + usuarioAdiciono + ", fechaAdiciono=" + fechaAdiciono + ", usuarioModifico=" + usuarioModifico + ", fechaModifico=" + fechaModifico + '}';
    }

    
    
    
}
