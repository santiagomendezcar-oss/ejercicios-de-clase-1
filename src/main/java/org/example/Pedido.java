package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String Codigo;
    private String Numero;
    private String Precio;
    private List<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public Pedido(String codigo, String numero, String precio) {
        Codigo = codigo;
        Numero = numero;
        Precio = precio;
        this.productos = new ArrayList<>();
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    // Método para inscribir productos al pedido
    public void inscribir(Producto producto) {
        this.productos.add(producto);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "Codigo='" + Codigo + '\'' +
                ", Numero='" + Numero + '\'' +
                ", Precio='" + Precio + '\'' +
                '}';
    }
}
