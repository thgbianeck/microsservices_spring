package com.formacionbdi.springboot.app.productos.models.service;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;

import java.util.List;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: springboot-servicio-productos
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 16/01/2022
 * Hora: 14:08
 */
public interface IProductoService {

    public List<Producto> findAll();
    public Producto findById(Long id);
}
