package TrabajoPracticoN7.Kata1_3;

public class Pedido {
    private Cliente cliente;
    private String estado;
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("Su pedido ha cambiado de estado a: " + estado);
    }

}
