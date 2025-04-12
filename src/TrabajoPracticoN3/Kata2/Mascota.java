package TrabajoPracticoN3.Kata2;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo (){
        System.out.println("Nombre: "+ nombre + "\nEspecie: "+ especie + "\nEdad: " + edad + "Años");
    }
    public void cumplirAnios (){
        edad ++;
    }
}