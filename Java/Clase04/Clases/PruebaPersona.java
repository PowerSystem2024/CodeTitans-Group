package Java.Clase04.Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Llamamos al constructor
        persona1.nombre = "Leandro"; // El valor hexadecimal normalmente comienza con 0x
        persona1.apellido = "Gonzalez";
        persona1.obtenerInformacion();

        // Creamos otro objeto
        Persona persona2 = new Persona();
        System.out.println("Persona2 = " + persona2);
        System.out.println("Persona1 = " + persona1);
        persona2.obtenerInformacion(); // Muestra "null" por que no contiene "informacion"
        persona2.nombre = "Agustin";
        persona2.apellido = "Gonzalez";
        persona2.obtenerInformacion(); // Contiene informacion y la muestra
    }
}
