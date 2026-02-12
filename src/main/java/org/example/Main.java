package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pedido pedido = null;

        int opcion;

        do {
            System.out.println("\n1. Crear pedido");
            System.out.println("2. Agregar producto");
            System.out.println("3. Mostrar pedido");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Código del pedido: ");
                    String codigo = scanner.nextLine();

                    pedido = new Pedido(codigo);
                    System.out.println("Pedido creado.");
                    break;

                case 2:
                    if (pedido == null) {
                        System.out.println("Primero cree un pedido.");
                        break;
                    }

                    System.out.print("Código del producto: ");
                    String codProd = scanner.nextLine();

                    System.out.print("Nombre del producto: ");
                    String nombreProd = scanner.nextLine();

                    Producto producto = new Producto(codProd, nombreProd);
                    pedido.agregarProducto(producto);

                    System.out.println("Producto agregado.");
                    break;

                case 3:
                    if (pedido == null) {
                        System.out.println("No hay pedido creado.");
                    } else {
                        System.out.println(pedido);
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
