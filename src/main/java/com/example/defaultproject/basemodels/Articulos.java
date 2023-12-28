package com.example.defaultproject.basemodels;

import java.math.BigDecimal;

public class Articulos {
    private String nombre;
    private String descripcion;
    private Integer descuento;

    public Articulos(String nombre, String descripcion, Integer descuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.descuento = descuento;
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

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }
}
