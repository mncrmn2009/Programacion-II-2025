package TrabajoPracticoN3.Kata5;

public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void despegar (){
        if (combustible < 10){
            System.out.println("Imposible el despegue, recargue combustible");
        } else {
            combustible-=10;
            System.out.println("Ha despegado!");
        }
    }
    public int avanzar (int distancia){

        if (combustible <= distancia){
            System.out.println("Insuficiente combustible, recargue combustible");
        } else {
            combustible-= distancia;
            System.out.println("Ha avanzado "+ distancia + " Kilometros \n");
        }
        return combustible;
    }
    public int recargarCombustible (int cantidad){

        if (cantidad < 0){
            System.out.println("No se puede recargar valores negativos");

        }else if (combustible + cantidad > 100) {
            System.out.println("Imposible la recarga, se sobrepasa el limite de la misma (capacidad max 100 unidades");
        }else {
            combustible+=cantidad;
            System.out.println("Recarga completa. Estado actual "+ combustible + " Litros");
        }
        return combustible;
    }
    public void mostrarEstado (){
        System.out.println("Nombre de la nave: "+ nombre + "\nCantidad de combustible: "+combustible);
    }
}

