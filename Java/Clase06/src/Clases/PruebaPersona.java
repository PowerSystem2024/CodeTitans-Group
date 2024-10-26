package Clases;

public class PruebaPersona {
    //desde este metodo main, crearemos nuestros objetos
    public static void main(String[] args) {
        /*

        Aqui llamamos a nuestra clase Persona creada dentro del package Clases
        y le asignamos una variable


        Cuando ponemos Persona() estamos llamando directamente
        al constructor, esta variable cuando se esta llamando al constructor desde la clase
        persona1 pasa a ser un objeto.
        El constructor es un metodo especial donde reserva memoria para crear un objeto,
        reservando un espacio de la memoria donde se creo el objeto y se le asigna a la variable
        asi se puede acceder a los atributos y metodos de la clase Persona en este caso

        Cuando creamos una variable dentro del main, es una variable local, al terminar la ejecucion en consola
        se destruye la variable, pero cuando la definimos y le asignamos la referencia de un objeto
        al instanciarla o crear un objeto, con new Persona() en este caso, se guarda y reserva memoria para el objeto,
        teniendo una referencia de memoria hexadecimal, comenzando con 0x, pudiendo acceder a los atributos y metodos
        creados en clase Persona, como nombre apellido y obtenerInformacion(metodo)

        */

        Persona persona1 = new Persona();

        persona1.nombre = "Ariel";
        persona1.apellido = "Betancud";

        //esto mostrara la informacion de los valores de los atributos en la clase

        persona1.obtenerInformacion();

        Persona persona2 = new Persona();

        //Aqui podemos ver la informacion que tienen los objetos, no comparten informacion solo los atributos
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);

        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";

    }

}
