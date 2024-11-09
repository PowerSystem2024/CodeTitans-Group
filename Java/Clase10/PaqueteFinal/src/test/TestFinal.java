/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo de donde se aplique:
    variable: evita cambiar el valor que almacena la variable
    metodos: evita que se modifique la definicion de un metodo desde una
            subclase(hija)
    clases: evita que se creen clases hijas
Otra caracteristica es que normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estatico para convertir una
variable en una constante, es decir que no se puede modificar su valor,
el ejemplo de esto es la clase Math en la cual todos sus atributos
son de tipo static y final, es por esto que la variable pi* se conoce como una
constante.
 */

package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        final int miDni = 36278885;
        System.out.println("miDni = " + miDni);
        //miDni = 23256235;
        //Persona.CONSTANTE_AQUI = 9; //no se modifica
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);


        final Persona persona1 = new Persona(); //utiliza un constructor vacio que se crea automaticamente

        persona1.setNombre("Ariel Betancud");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("persona1 nombre: " + persona1.getNombre());
    }



}
