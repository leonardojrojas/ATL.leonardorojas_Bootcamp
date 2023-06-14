package Clase_06;

import java.util.Scanner;

public class CuentoOp {
    public static void main (String[] args) {
        System.out.println(" Es una noche estrellada, te encuentras en un bosque misterioso: \n" +
                "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n");
        Scanner opciones = new Scanner( System.in);
        System.out.println(" Elija una opcion");
        byte opcion = opciones.nextByte();
        if (opcion == 1){
            System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena " +
                    "de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos" +
                    " que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido" +
                    " del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para" +
                    " compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso" +
                    " en tu búsqueda!\n");
        }
        if (opcion == 2){
            System.out.println("Decides seguir el sendero iluminado hacia" +
                    " la pequeña cabaña acogedora. Al llegar a la cabaña," +
                    " te das cuenta de que hay dos puertas: \n" +
                    "1) Entras por la puerta de la izquierda \n" +
                    "2) Optas por la puerta de la derecha");

        }
        Scanner opcionfinal = new Scanner( System.in);
        System.out.println(" Elija una opcion");
        byte opcionfin = opcionfinal.nextByte();
        if (opcionfin == 1){
            System.out.println("Vives en la dimension actual");

        }
        if (opcionfin == 2){
            System.out.println("Vives en otra dimension");

        }


    }
}
