package Clase_06;

import java.util.Scanner;

public class BuscadorPaises {
    public static void main(String[] args) {
        Scanner nuevoPais = new Scanner(System.in);
        System.out.println(" Introduce el pais de busqueda");
        String pais = nuevoPais.next();
        System.out.println("https://www.google.com/maps/search/" + pais);
        nuevoPais.close();


    }
}