package PasoPorReferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {

        //todas las clases en Java heredan de la clase object
        //la clase object es la padre de todas las clases
        //llamamos al constructor de la clase Persona y accedemos a los atributos
        // a travez del objeto persona1 que hemos creado

        Persona persona1 = new Persona();

        persona1.nombre = "Ester";
        System.out.println("persona1 nombre = " + persona1.nombre);

        cambiarValor(persona1); // pasa la referencia de persona1 al método cambiarValor
        System.out.println("El cambio que hicimos en el nombre es: "+persona1.nombre);
        persona1 = cambiarElValor(persona1);

        //Persona persona2 = new Persona();
        Persona persona2 = null;
        persona2 = cambiarElValor(persona2);
        //System.out.println("El nuevo valor del objeto es: " + persona2.nombre);
    }

    //para acceder al objeto y a la clase, el paso por referencia sera a travez de la clase Persona
    public static void cambiarValor(Persona persona){

        persona.nombre = "Maria"; // Esto cambia el nombre del objeto que persona1 está apuntando

    }

    //la palabra Persona antes del nombre del metodo significa que el
    //metodo retorna un objeto de tipo Persona

    public static Persona cambiarElValor(Persona persona){
        if(persona == null){
            System.out.println("Valor de persona es invalido: Null");
            return null;
        }else{
            persona.nombre = "Monica";
            return persona;
        }

    }
}
