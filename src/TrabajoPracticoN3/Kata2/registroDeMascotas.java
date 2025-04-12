package TrabajoPracticoN3.Kata2;

public class registroDeMascotas {
    public static void main(String[] args) {
        Mascota perrito = new Mascota("Theo","Perro",3);
        System.out.println("Informacion de la mascota");
        perrito.mostrarInfo();

        perrito.cumplirAnios();
        System.out.println("Informacion pasado un año");
        perrito.mostrarInfo();
    }
}
