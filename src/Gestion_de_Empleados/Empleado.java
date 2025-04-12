package Gestion_de_Empleados;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {

        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++;
    }

    public Empleado(String nombre, String puesto) {

        //this(123,nombre,puesto,00.0);
        this.id = ++totalEmpleados;
        this.salario = 15000.0;
        this.nombre = nombre;
        this.puesto = puesto;
        totalEmpleados ++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    public void actualizarSalario (int porcentajeAumento){
        this.salario += this.salario * porcentajeAumento/100;
    }
    public void actualizarSalario (double cantidadFija){
        this.salario += cantidadFija;

    }

    @Override
    public String toString() {
        return "Empleado=" +
                " id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario;
    }
    public static void mostrarTotalEmpelados(){
        System.out.println("Cantidad de Empleados:" + totalEmpleados);
    }
}
