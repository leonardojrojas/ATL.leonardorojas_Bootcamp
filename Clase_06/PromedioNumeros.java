package Clase_06;

import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] arg) {
        System.out.println("El siguiente programa calculara el promedio de tre(3) numeros");
        Scanner numeroA = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int primerNumero = numeroA.nextInt();
        System.out.println("Introduce el segundo numero");
        int segNumero = numeroA.nextInt();
        System.out.println("Introduce el tercer numero");
        int tercNumero = numeroA.nextInt();
        float calpromedio = (float) (primerNumero + segNumero + tercNumero) / 3;
        System.out.println("El promedio es : " + calpromedio );
    }
}
