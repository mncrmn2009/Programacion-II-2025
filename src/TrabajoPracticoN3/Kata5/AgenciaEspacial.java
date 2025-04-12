package TrabajoPracticoN3.Kata5;

import java.util.Scanner;

public class AgenciaEspacial {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Apolo11",50);
        Scanner sc= new Scanner(System.in);
        int eleccion;

        do {
            System.out.println("Que desea hacer (coloque el numero): \n1-Despegar \n2-Avanzar \n3-Recargar combustible \n4-Mostrar el Estado \n0-Salir");
            eleccion = sc.nextInt();
            switch (eleccion){
                case 1:
                    nave1.despegar();
                    break;
                case 2:
                    System.out.println("Que cantidad de Km quiere avanzar");
                    nave1.avanzar(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Cuanto combustible recargar (Cantidad en numeros)");
                    nave1.recargarCombustible(sc.nextInt());
                    break;
                case 4:
                    nave1.mostrarEstado();
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("No valido");
            }

        } while (eleccion != 0);


    }
}
