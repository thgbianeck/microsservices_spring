package com.formacionbdi.springboot.app.item.models.service;

import com.formacionbdi.springboot.app.item.models.Item;

import java.util.List;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: springboot-servicio-item
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 25/01/2022
 * Hora: 01:19
 */
public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
