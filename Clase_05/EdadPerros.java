package Clase_05;

import java.util.Scanner;

import static java.lang.Math.log;

public class EdadPerros {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println(" Indique la edad Cronologica del Perro");
        float edadCronologica = cargaDeDatos.nextFloat();
        float edadperro = (float) (((log(edadCronologica))*16)+31);
        System.out.println(" la edad del Perro es " +  edadperro + " Años Humanos");

    }
}
