/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author egarc
 */
@Entity
@DynamicUpdate
@Table(name = "bd_catalogo",
         schema = "bd_rincon_gt"
)
public class CatalogoModel {
    @Id
    @Column(name = "codigo_catalogo", unique = true, nullable = false)
    private Integer codigoCatalogo;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "usuario_adiciono")
    private String usuarioAdiciono;
    
    @Column(name = "fecha_adiciono")
    private Date fechaAdiciono;
    
    @Column(name = "usuario_modifico")
    private String usuarioModifico;
    
    @Column(name = "fecha_modifico")
    private Date fechaModifico;

    public CatalogoModel() {
    }

    public CatalogoModel(Integer codigoCatalogo, String nombre, String descripcion, String usuarioAdiciono, Date fechaAdiciono, String usuarioModifico, Date fechaModifico) {
        this.codigoCatalogo = codigoCatalogo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usuarioAdiciono = usuarioAdiciono;
        this.fechaAdiciono = fechaAdiciono;
        this.usuarioModifico = usuarioModifico;
        this.fechaModifico = fechaModifico;
    }

    public Integer getCodigoCatalogo() {
        return codigoCatalogo;
    }

    public void setCodigoCatalogo(Integer codigoCatalogo) {
        this.codigoCatalogo = codigoCatalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return "CatalogoModel{" + "codigoCatalogo=" + codigoCatalogo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", usuarioAdiciono=" + usuarioAdiciono + ", fechaAdiciono=" + fechaAdiciono + ", usuarioModifico=" + usuarioModifico + ", fechaModifico=" + fechaModifico + '}';
    }
    
}
