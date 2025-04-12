package TrabajoPracticoN3.Kata4;

public class GranjaDigital {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina("G1001", 2,5);
        Gallina gallina2 = new Gallina("G1002",3,10);

        gallina1.mostrarEstado();

        System.out.println("La gallina ID G1001 ha puesto un huevo");
        gallina1.ponerHuevo();
        System.out.println("La gallina ID G1001 ha envejecido un año");
        gallina1.envejecer();

        gallina1.mostrarEstado();
        System.out.println("________________");
        gallina2.mostrarEstado();

        System.out.println("La gallina ID G1002 ha puesto un huevo");
        gallina2.ponerHuevo();
        System.out.println("La gallina ID G1002 ha envejecido un año");
        gallina2.envejecer();


        gallina2.mostrarEstado();
    }
}
