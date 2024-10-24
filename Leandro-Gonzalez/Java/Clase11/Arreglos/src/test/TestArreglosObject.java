import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Leandro");
        personas[1] = new Persona("Agustin");
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);

        // Usamos un cliclo for para iterar los elementos
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + " = " + personas[i]);

        }

        // Sintaxis resumida para trabajar con arreglos
        String frutas[] = { "Banana", "Manzana", "Frutilla" };
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + " = " + frutas[i]);

        }

    }
}
