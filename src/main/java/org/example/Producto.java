package org.example;

public class Producto {
    private String nombre;
    private String color;
    private String precio;

    public Producto() {
    }

    public Producto(String nombre, String color, String precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
