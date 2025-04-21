package TrabajoPracticoN4.Kata1;

public class SistemaSoporte {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Nicolas","falso123@direccion");
        TicketSoporte ticket1 = new TicketSoporte(1001,"Problema","25/04");
        TicketSoporte ticket2 = new TicketSoporte(1002,"Problema2","24/04",usuario);
        ticket1.asignarTecnico("marcos","Tecnico");

        ticket1.mostrarDetalle();



    }
}
