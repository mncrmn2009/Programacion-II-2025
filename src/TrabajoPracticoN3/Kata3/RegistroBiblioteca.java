package TrabajoPracticoN3.Kata3;

import java.util.Scanner;

public class RegistroBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro1 = new Libro("Harry Potter","Joanne Rowling",1997);
        int anioNuevo;
        System.out.println("Que año de publicacion quiere que tenga el libro " + libro1.getTitulo() +"?");
        anioNuevo = sc.nextInt();

        libro1.setAnioPublicacion(anioNuevo);

        System.out.println("Titulo: "+ libro1.getTitulo() + "\nAutor: "+ libro1.getAutor() + "\nAño: "+ libro1.getAnioPublicacion());
    }
}
