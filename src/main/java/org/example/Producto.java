package org.example;

public class Producto {

    private String codigo;
    private String nombre;

    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " - Nombre: " + nombre;
    }
}
