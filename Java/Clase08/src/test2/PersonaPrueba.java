//contexto estatico

package test2;

import domain.Persona;

public class PersonaPrueba {

    private int contador;

    public static void main(String[] args) {

        Persona persona1 = new Persona("Ariel");
        System.out.println("persona1 = " + persona1 );

        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10; //No se puede referenciar desde un contexto estatico3
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }

    public static void imprimir(Persona persona){

        System.out.println("persona = " + persona);

    }


    /*
    Este tipo de instanciación se llama instanciación
    sin referencia o instanciación directa, ya que el objeto creado no se guarda en una variable.
    */

    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}
