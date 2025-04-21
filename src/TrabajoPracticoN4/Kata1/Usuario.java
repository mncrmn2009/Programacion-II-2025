package TrabajoPracticoN4.Kata1;


public class Usuario {
    private static int idContador = 1;
    private String nombre;
    private String email;
    private int id;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.id = idContador ++;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
