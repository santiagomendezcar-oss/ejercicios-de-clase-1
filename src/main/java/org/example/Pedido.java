package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String codigo;
    private List<Producto> productos;

    public Pedido(String codigo) {
        this.codigo = codigo;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public String toString() {
        String resultado = "Pedido: " + codigo + "\nProductos:\n";

        if (productos.isEmpty()) {
            resultado += "No hay productos.\n";
        } else {
            for (Producto p : productos) {
                resultado += p + "\n";
            }
        }

        return resultado;
    }
}
