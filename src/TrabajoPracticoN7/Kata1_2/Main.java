package TrabajoPracticoN7.Kata1_2;

public class Main {
    public static void main(String[] args) {
        PagoConDescuento tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        PagoConDescuento paypal = new Paypal("usuario@paypal.com");
        double monto = 500;
        double descuento = 10;
        tarjeta.procesarPago(monto * tarjeta.aplicarDescuento(descuento));
        paypal.procesarPago(monto * paypal.aplicarDescuento(descuento));

    }
}
