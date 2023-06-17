package Clase_06;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] arg) {
        System.out.println("El siguiente programa determian el mayor y el menor de tre(3) numeros");
        Scanner numeroA = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int primerNumero = numeroA.nextInt();
        System.out.println("Introduce el segundo numero");
        int segNumero = numeroA.nextInt();
        System.out.println("Introduce el tercer numero");
        int tercNumero = numeroA.nextInt();
        if (primerNumero > segNumero && primerNumero > tercNumero){
            System.out.println(" El primero es mayor y es igual a " + primerNumero);
        }
        if (segNumero > primerNumero && segNumero > tercNumero){
            System.out.println(" El  segundo es mayor y es igual a " + segNumero);
        }
        if (tercNumero > primerNumero && tercNumero > segNumero){
            System.out.println(" El tercero es mayor y es igual a " + tercNumero);
        }
        if (primerNumero < segNumero && primerNumero < tercNumero){
            System.out.println(" El primero es menor y es igual a " + primerNumero);
        }
        if (segNumero < primerNumero && segNumero < tercNumero){
            System.out.println(" El  segundo es menor y es igual a " + segNumero);
        }
        if (tercNumero < primerNumero && tercNumero < segNumero){
            System.out.println(" El tercero es menor y es igual a " + tercNumero);
        }
        //        float calpromedio = (float) (primerNumero + segNumero + tercNumero) / 3;
//        System.out.println("El promedio es : " + calpromedio );
    }
}
