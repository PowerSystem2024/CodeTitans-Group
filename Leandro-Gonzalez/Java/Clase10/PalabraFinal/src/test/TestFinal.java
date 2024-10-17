/*
 * Uso de la palabra reservada final
 * Esta palabra tiene diferentes significados dependiendo de donde se use:
 * 1. Si se usa en una Variable, significa que no se puede cambiar el valor de la variable
 * 2. Si se usa en un Metodo, significa que no se puede sobreescribir el metodo en una subclase (hija)
 * 3. Si se usa en una Clase, significa que no se puede heredar de esa clase
 * 
 * Otra caracteristica es que normamente, cuando trabajamos con variables se combina con el modificador de acceso static
 * para que la variable sea una constante de la clase, es decir que no se puede modificar su valor
 * Un ejemplo de esto es la clase Math en la cual todos sus atributos son de tipo final y static
 * Por eso la variable PI se conoce como una constante de la clase Math
 */

package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 2510654;
        System.out.println("miDni = " + miDni);
        // miDni = 123456; // Error: no se puede modificar el valor de una variable
        // final

        // Persona.MI_CONSTANTE = 10; // Error: no se puede modificar el valor de una
        // constante
        System.out.println("Mi atributo constante es: " + Persona.MI_CONSTANTE);

        final Persona persona1 = new Persona();
        // persona1 = new Persona(); // Error: no se puede modificar la referencia de
        // una variable final
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Carlos"); // Si se puede modificar el valor del atributo
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
}
