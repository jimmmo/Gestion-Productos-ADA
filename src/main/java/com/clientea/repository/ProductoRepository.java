/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clientea.repository;

import com.clientea.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jimmyvelandia
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Métodos de consulta personalizados pueden agregarse aquí si es necesario
}