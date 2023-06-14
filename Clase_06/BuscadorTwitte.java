package Clase_06;

import java.util.Scanner;

public class BuscadorTwitte {
    public static void main (String[] args) {
        Scanner nuevoTwite = new Scanner(System.in);
        System.out.println(" Introduce el nombre de busqueda");
        String nombreB = nuevoTwite.next();
        System.out.println("https://twitter.com/search?q="+ nombreB);
        nuevoTwite.close();
    }
}
