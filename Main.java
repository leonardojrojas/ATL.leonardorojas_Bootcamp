import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            // calculo de ICM
            // peso en kg/altura al cuadrado en metros
            Scanner cargaDeDatos = new Scanner(System.in);
            System.out.println(" Carge su peso en Kg");
            double peso = cargaDeDatos.nextDouble();
            System.out.println(" Carge su Altura en metros");
            double altura = cargaDeDatos.nextDouble();
            double indiceMasaCorporal = peso/ (altura*altura);
            System.out.println( " Su ICM es de " + indiceMasaCorporal);

            // Mayor a 30 -> Obesidad
            if (indiceMasaCorporal >= 30) {
                System.out.println(" Estas en estado de Obesidad");
            }
            // Entre 25 y 30 -> Sobrepeso
            if (indiceMasaCorporal >= 25 && indiceMasaCorporal < 30 ) {
                System.out.println(" Estas en estado de Sobrepeso");
            }
            // Entre 18.5 y 25 -> Normal
            if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal < 25 ) {
                System.out.println(" Estas en estado de Saludable");
            }
            // menor a 18.5 -> Normal
            if (indiceMasaCorporal < 18.5 ) {
                System.out.println(" Estas en estado de Normal");
            }


        /*
        System.out.println("¿ Que edad tienes?");
        Scanner cargaDeDatos = new Scanner(System.in);
        int edad = cargaDeDatos.nextInt();

        if (edad >=18) {
            System.out.println(" Es mayor de Edad");
        } else {
            System.out.println(" Es menor de Edad");
        }

         */
        }
    }

