package test;

//Diferentes formas de importar clases

//import ar.com.codesystem.*; // Importamos todas las clases del paquete
import ar.com.codesystem.Utileria;
//import static ar.com.codesystem.Utileria.imprimir; // Importcion para metodos estaticos

public class TestUtileria {

    public static void main(String[] args) {
        Utileria.imprimir("Hola a todos desde TestUtileria");
        // imprimir("Hola a todos desde TestUtileria");
        // ar.com.codesystem.Utileria.imprimir("Hola a todos desde TestUtileria"); //
        // Forma de importar la clase completa
    }
}
