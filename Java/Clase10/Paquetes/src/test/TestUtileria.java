package test;

import ar.com.codesystem.Utileria;
import static ar.com.codesystem.Utileria.imprimir; //utilizaremos un atributo o metodo de clase static

//distintas formas de importar clases y acceder a un metodo


public class TestUtileria {

    public static void main(String[] args) {
        Utileria.imprimir("Saludos a todos los alumnos de la tecnicatura");
        imprimir("Terminamos en unos minutos");
        ar.com.codesystem.Utileria.imprimir("Ahora si estamos terminando");
    }


}
