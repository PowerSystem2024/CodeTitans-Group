package Java.Clase08.ContextoEstatico.test;

// Importamos la clase Persona
import Java.Clase08.ContextoEstatico.domain.Persona;

public class PersonaPrueba {
    // creamos un contador de personas
    private int contador;

    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Carla");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);// llamamos al método imprimir y le pasamos el objeto
        imprimir(persona2);
        // this.contador = 10; // no se puede hacer referencia a un contexto estático
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }

    // creamos un método para imprimir
    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }

    // creamos un método para imprimir el contador de personas
    public int getContador() {
        imprimir(new Persona("Juana"));
        return this.contador;
    }
}
