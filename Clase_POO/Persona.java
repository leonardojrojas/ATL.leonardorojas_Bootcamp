package Clase_POO;

public class Persona {
    private Integer id;
    private String nombre;
    private Integer edad;
    private String fecha_nacimiento;
    private Integer dni;

    public Persona(Integer parameterId, String parameterName, Integer parameterAge, String parameterDate, Integer parameterDni){
        id = parameterId;
        nombre = parameterName;
        edad = parameterAge;
        fecha_nacimiento = parameterDate;
        dni = parameterDni;
    }

    public void showDatos() {
        System.out.println(" ID : " + id);
        System.out.println(" Nombre : " + nombre);
        System.out.println(" Edad : " + edad);
        System.out.println(" Fecha de Nacimiento : " + fecha_nacimiento);
        System.out.println(" DNI : " + dni);

    }
    public void mayorDeEdad() {
        if (edad > 18) {
            System.out.println( nombre + " es mayor de edad");
        }
        else {
            System.out.println( nombre + " es menor de edad");
        }
    }
    private Integer getId() {
            return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    private String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    private Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}







