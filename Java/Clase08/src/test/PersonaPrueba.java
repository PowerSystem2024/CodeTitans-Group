package test;

import Dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        //argumentos que necesita el constructor
        Persona persona1 = new Persona("Osvaldo", 57.000, false);

        System.out.println("persona1: " + persona1);

        System.out.println("persona1 su nombre es: " +persona1.getNombre());

        //Modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");

        //persona1.nombre = "Juan Ignacio"; //ya no se puede utilizar
        //System.out.println("Nombre es: " + persona1.nombre);//error

        System.out.println("persona1 con su nombre modificado: " +persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo es: "+ persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());

        System.out.println("persona1: " + persona1); //llama directamente al metodo toString

        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //e imprimir, luego modificar sus valores y volver a imprimir

        Persona persona2 = new Persona("Ariel", 2000000.00, false);

        System.out.println("persona2 su nombre es: " + persona2.getNombre());

        persona2.setNombre("Natalia");
        persona2.setSueldo(1800000.00);

        System.out.println("persona2 su nombre es: " + persona2.getNombre());
        System.out.println("persona2 su sueldo es: " + persona2.getSueldo());
        System.out.println("persona2 esta eliminada: " + persona2.isEliminado());




    }
}
