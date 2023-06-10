package Clase_05;
import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner cargaDePrecio = new Scanner(System.in);
        System.out.println("Ingrese el precio original de un producto");
        double listprice = cargaDePrecio.nextDouble();
        System.out.println("ingrese el porcentaje de descuento");
        double discount = cargaDePrecio.nextDouble();
        double salesPrice = listprice - ( listprice*discount/100);
        System.out.println(" El precio final es " + salesPrice + " Dolares");

    }
}