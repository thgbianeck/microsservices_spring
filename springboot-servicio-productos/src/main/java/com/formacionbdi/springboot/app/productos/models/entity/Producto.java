package com.formacionbdi.springboot.app.productos.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: springboot-servicio-productos
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 16/01/2022
 * Hora: 12:28
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    private static final long serialVersionUID = 1285454306356845809L;
}
