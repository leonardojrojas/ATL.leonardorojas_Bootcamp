package Clase_POO;


import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        Persona persona1 = cargarPersona();
        persona1.showDatos();
        persona1.mayorDeEdad();
    }
    private static Persona cargarPersona() {
        Scanner teclado = new Scanner(System.in);
        Persona persona = new Persona(10,"leo",44,"26-06-1977",13869014);
        System.out.println(" Ingrese su ID");
        persona.setId(teclado.nextInt());
        System.out.println(" Ingrese su Nombre");
        persona.setNombre(teclado.next());
        System.out.println(" Ingrese su Edad");
        persona.setEdad(teclado.nextInt());
        System.out.println(" Ingrese su Fecha de nacimiento");
        persona.setFecha_nacimiento(teclado.next());
        System.out.println(" Ingrese su DNI");
        persona.setDni(teclado.nextInt());
        return persona;
    }

}
