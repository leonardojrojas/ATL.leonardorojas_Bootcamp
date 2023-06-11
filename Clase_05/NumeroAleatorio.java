package Clase_05;

import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 100 + 1);
        System.out.println("Adivine el numero del 1 al 100");
        Scanner cargaDeNumero = new Scanner(System.in);
        int numeroUser = cargaDeNumero.nextInt();
        if (numeroUser == numero) {
            System.out.println(" Usted adivino con el numero " + numeroUser);
        } else {
            System.out.println("Numero invalido");
            System.out.println("Numero valido era : " +  numero);
        }
    }
}


