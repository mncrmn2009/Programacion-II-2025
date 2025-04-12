package TrabajoPracticoN3.Kata3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public void setAnioPublicacion(int nuevoAnio) {
        if ((nuevoAnio < 1900) || (nuevoAnio > 2025)){
            System.out.println("No se puede modificar");
        } else {
            anioPublicacion = nuevoAnio;
        }
    }

}
