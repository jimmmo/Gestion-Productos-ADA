/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clientea.service;

import com.clientea.model.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author jimmyvelandia
 */
/*public class ProductoService {
    
}*/

public interface ProductoService {
    Producto crearProducto(Producto producto);
    Producto actualizarProducto(Long id, Producto producto);
    void eliminarProducto(Long id);
    Optional<Producto> obtenerProductoPorId(Long id);
    List<Producto> obtenerTodosProductos();
}