package TrabajoPracticoN7.Kata1;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.agregarProducto(new Producto("Computadora", 1000));
        pedido.agregarProducto(new Producto("Mouse", 50));
        pedido.agregarProducto(new Producto("Teclado", 80));
        System.out.println("Total a pagar: $" + pedido.calcularTotal());

    }
}
