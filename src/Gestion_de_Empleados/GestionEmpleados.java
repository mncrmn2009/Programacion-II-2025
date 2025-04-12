package Gestion_de_Empleados;

public class GestionEmpleados {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(1,"Nicolas","Auxiliar",30000.0);
        Empleado empleado2 = new Empleado("Marcos","Auxiliar");


        System.out.println("Antes del aumento");
        System.out.println(empleado1);

        System.out.println(empleado2);
        System.out.println("______");
        System.out.println("Aumento de salario del empleado "+ empleado2.getNombre() + "de 3000 pesos");
        empleado2.actualizarSalario(3000.0);
        System.out.println("Aumento de salario del empleado "+ empleado1.getNombre() + "de 10%");
        empleado1.actualizarSalario(10);
        System.out.println();
        System.out.println("Despues del aumento");
        System.out.println(empleado1);
        System.out.println(empleado2);

        Empleado.mostrarTotalEmpelados();
    }
}
