package TrabajoPracticoN3.Kata4;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo (){
        huevosPuestos ++;
    }
    public void envejecer(){
        edad ++;
    }
    public void mostrarEstado (){
        System.out.println("IDGallina: "+ idGallina+"\nEdad: "+edad+"\nCantidad de huevos puestos: "+ huevosPuestos);
    }
}
