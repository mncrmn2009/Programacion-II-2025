package TrabajoPracticoN3.Kata1;

import java.util.Scanner;

public class registroDeEstudiantes {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Nicolas","Castro","A",8);
        Scanner sc = new Scanner(System.in);
        String metodo;
        double puntos;
        estudiante1.mostrarInfo();

        System.out.print("Coloque B para bajar la calificacion o S para subir la calificacion: ");
        metodo = sc.nextLine();
        metodo = metodo.toUpperCase();
        System.out.println("Que cantidad de puntos?");
        puntos = sc.nextDouble();
        estudiante1.modificarCalificacion(metodo,puntos);

        System.out.println(estudiante1.getCalificacion());
    }
}
