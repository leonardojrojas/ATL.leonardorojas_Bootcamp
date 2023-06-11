package Clase_05;

import java.util.Scanner;

public class Propinas {
    public static void main(String[] args) {
        Scanner cargaDeCuenta = new Scanner(System.in);
        System.out.println("Ingrese el Total de la cuenta");
        double cuentatotal = cargaDeCuenta.nextDouble();
        System.out.println("ingrese el porcentaje de Propina");
        double propina = cargaDeCuenta.nextDouble();
        double calpropina = cuentatotal * (propina / 100);
        System.out.println(" La propina son " + calpropina+ " Dolares");

    }
}

