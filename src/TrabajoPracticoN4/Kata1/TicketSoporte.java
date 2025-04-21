package TrabajoPracticoN4.Kata1;


public class TicketSoporte {
    private int id;
    public String descripcion;
    private EstadoTicket estadoTicket;
    private String fechaCreacion;
    private Usuario usuario;
    private String tecnicoAsignado;

    public TicketSoporte(int id, String descripcion, String fechaCreacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estadoTicket = EstadoTicket.ABIERTO;
    }

    public TicketSoporte(int id, String descripcion, String fechaCreacion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        this.estadoTicket = EstadoTicket.ABIERTO;
    }

    public void cerrarTicket(){
        this.estadoTicket = EstadoTicket.CERRADO;
    }


    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estadoTicket=" + estadoTicket +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", usuario=" + usuario +
                ", tecnicoAsignado='" + tecnicoAsignado + '\'' +
                '}';
    }

    public void mostrarDetalle(){
        System.out.println(this);
    }
    public void asignarTecnico(String nombre, String especialidad){
        this.tecnicoAsignado = new Tecnico(nombre, especialidad).toString();
    }

}
