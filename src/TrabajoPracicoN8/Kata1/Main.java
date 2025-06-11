package TrabajoPracicoN8.Kata1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de productos con diferentes tipos de ID
        List<Producto<?>> productos = new ArrayList<>();

        // Producto con ID de tipo String (por ejemplo, código SKU)
        productos.add(new Producto<String>("SKU123", "Mouse inalámbrico", 25.99));

        // Producto con ID de tipo Integer (por ejemplo, ID numérico interno)
        productos.add(new Producto<Integer>(101, "Teclado mecánico", 75.50));

        // Producto con ID de tipo Long
        productos.add(new Producto<Long>(10000000001L, "Monitor 24\"", 199.99));

        // Producto con ID de tipo String
        productos.add(new Producto<String>("SKU456", "Auriculares Bluetooth", 59.99));

        // Imprimir la lista de productos
        for (Producto<?> producto : productos) {
            System.out.println(producto);
        }

        // Crear productos con distintos tipos de identificadores
        Producto<String> p1 = new Producto<>("SKU001", "Cámara", 299.99);
        Producto<Integer> p2 = new Producto<>(2001, "Trípode", 49.99);
        Producto<String> p3 = new Producto<>("SKU002", "Memoria SD", 19.99);

        // Crear carrito de compras
        Carrito<Producto<?>> carrito = new Carrito<>();

        // Agregar productos al carrito
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        // Mostrar productos en el carrito
        System.out.println("Contenido del carrito:");
        carrito.mostrarProductos();

        // Calcular y mostrar total
        System.out.printf("Total del carrito: $%.2f\n", carrito.obtenerTotal());

        // Eliminar un producto y mostrar estado actualizado
        carrito.eliminarProducto(p2);
        System.out.println("\nDespués de eliminar un producto:");
        carrito.mostrarProductos();
        System.out.printf("Total actualizado: $%.2f\n", carrito.obtenerTotal());


    }
}
