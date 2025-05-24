package TrabajoPracticoN7.Kata1_3;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nicolas Castro", "ejemplo@123.com");
        Pedido pedido = new Pedido(cliente);
        pedido.cambiarEstado("Enviado");
        pedido.cambiarEstado("Entregado");

    }
}
