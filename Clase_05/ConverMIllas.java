package Clase_05;
import java.util.Scanner;

public class ConverMIllas {
    public static void main(String[] args) {
        Scanner cargaDeMillas = new Scanner(System.in);
        System.out.println("Introduce valor en Millas");
        double valueMilles = cargaDeMillas.nextDouble();
        double valueKm = valueMilles * 1.60934;
        System.out.println(" El valor es " + valueKm + " Kilometros");

    }
}

