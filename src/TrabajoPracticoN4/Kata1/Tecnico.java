package TrabajoPracticoN4.Kata1;

public class Tecnico {
    private static int idContador = 101;
    private int id;
    private String nombre;
    private String especialidad;

    public Tecnico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void setID (){
        id = idContador ++;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
