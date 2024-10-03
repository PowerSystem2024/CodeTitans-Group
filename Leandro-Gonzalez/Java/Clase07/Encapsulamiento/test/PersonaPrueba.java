package Java.Clase07.Encapsulamiento.test;

import Java.Clase07.Encapsulamiento.dominio.Persona; // Importamos la clase Persona

public class PersonaPrueba {
    public static void main(String[] args) {
        // Creamos un constructor con los atributos de la clase Persona y le pasamos los
        // valores
        Persona persona1 = new Persona("Juan", 5000.00, false);
        // llamamos al método toString
        System.out.println("persona1: " + persona1);
        System.out.println("persona1 su nombre es: " + persona1.getNombre());

        // Modificar a traves de los métodos setter
        persona1.setNombre("Juan Carlos");
        // persona1.nombre = "Juan Carlos"; No se puede acceder directamente al atributo
        // nombre porque es privado
        // System.out.println("Nombre es:" + persona1.nombre);No se puede acceder
        // directamente al atributo nombre porque
        // es privado
        System.out.println("persona1 su nombre modificado es: " + persona1.getNombre());
        System.out.println("persona1 su sueldo es: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());

        // Crear otro objeto de tipo Persona, asignar valores de manera inicial
        // Imprimir, luego modificar sus valores y volver a imprimir

        Persona persona2 = new Persona("Carla", 6000.00, true);
        System.out.println("persona2 su nombre es: " + persona2.getNombre());

        persona2.setNombre("Carla María");
        System.out.println("persona2 su nombre modificado es: " + persona2.getNombre());
        System.out.println("persona2 su sueldo es: " + persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: " + persona2.isEliminado());

        // llamamos al método toString
        System.out.println("persona1: " + persona1);

    }
}
