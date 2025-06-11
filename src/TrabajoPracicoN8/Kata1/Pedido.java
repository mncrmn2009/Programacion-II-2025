package TrabajoPracicoN8.Kata1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Comparable<Pedido> {
    private int id;
    private List<Producto<?>> productos;
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto<?> producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto<?> producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", total=" + calcularTotal() +
                '}';
    }
}

