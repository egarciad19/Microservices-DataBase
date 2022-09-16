/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.repository;

import com.rincon.gt.efgarcid.models.CatalogoModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author egarc
 */
public interface CatalogoRepository extends JpaRepository<CatalogoModel, Integer>{
    
}
