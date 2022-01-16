package com.formacionbdi.springboot.app.productos.models.dao;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: springboot-servicio-productos
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 16/01/2022
 * Hora: 12:14
 */
public interface ProductoDao extends CrudRepository<Producto, Long> {
}
