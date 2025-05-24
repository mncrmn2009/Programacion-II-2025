package TrabajoPracticoN7.Kata1_2;

public class Paypal implements PagoConDescuento{
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con PayPal: " + email);
    }
    @Override
    public double aplicarDescuento(double porcentaje) {
        return 1 - (porcentaje / 100);
    }
}
