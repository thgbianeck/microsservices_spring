package com.formacionbdi.springboot.app.item.models.service;

import com.formacionbdi.springboot.app.item.models.Item;
import com.formacionbdi.springboot.app.item.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: springboot-servicio-item
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 25/01/2022
 * Hora: 01:19
 */
@Service
public class ItemServiceImpl implements ItemService{

    public static final String PRODUCTOS_LISTAR = "http://localhost:8001/listar";
    public static final String PRODUCTOS_VER = "http://localhost:8001/ver/{id}";

    @Autowired
    private RestTemplate clientRest;

    @Override
    public List<Item> findAll() {
        return Arrays.stream(Objects.requireNonNull(clientRest.getForObject(PRODUCTOS_LISTAR, Producto[].class)))
                .map(p -> new Item(p, 1))
                .collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        Map<String, String> pathVariables = new HashMap<String, String>();
        pathVariables.put("id", id.toString());
        Producto producto = clientRest.getForObject(PRODUCTOS_VER, Producto.class, pathVariables);
        return new Item(producto, cantidad);
    }
}
