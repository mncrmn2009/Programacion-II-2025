package TrabajoPracticoN3.Kata1;

public class Estudiante {
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void mostrarInfo (){
        System.out.println("La informacion del estudiante es: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: "+ calificacion);
    }
    private void subirCalificacion (double puntos){
        if (calificacion+puntos > 10){
            calificacion = 10;

        }else {
            calificacion += puntos;

        }
    }
    private void bajarCalificacion (double puntos){
        if (calificacion-puntos < 0){
            calificacion = 0;
        } else {
            calificacion -= puntos;
        }

    }
    public void modificarCalificacion (String tipo, double puntos){

        if (tipo.equals("B")) {
            bajarCalificacion(puntos);
        } else if (tipo.equals("S")) {
            subirCalificacion(puntos);
        }

    }
}
