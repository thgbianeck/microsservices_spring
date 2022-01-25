package com.formacionbdi.springboot.app.item.models.service;

import com.formacionbdi.springboot.app.item.models.Item;

import java.util.List;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: springboot-servicio-item
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 25/01/2022
 * Hora: 01:20
 */
public class ItemServiceFeign implements ItemService{
    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return null;
    }
}
