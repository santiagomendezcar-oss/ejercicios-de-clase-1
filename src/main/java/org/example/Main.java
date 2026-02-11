import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto a1 = new Producto("Caja", "cafe", "1.000");
        Producto a2 = new Producto("Lapiz", "rojo", "2.000");
        Producto a3 = new Producto("Camisa", "blanco", "20.000");


        Pedido p1 = new Pedido("4455", "1", "23.000");
        Pedido p2 = new Pedido("4456", "2", "2.000");


        p1.inscribir(a1);
        p1.inscribir(a2);
        p1.inscribir(a3);
        p2.inscribir(a2);


        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(p1);
        pedidos.add(p2);

        pedidos.forEach(pedido -> {
            System.out.println(pedido);
            pedido.getProductos().forEach(producto -> System.out.println(producto));
            System.out.println();
        });
    }
}
