//Pedir un numero N y mostrar todos los numeros del 1 al N.

package Java.Clase05.Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;
        while (i <= numero) {
            System.out.println(i);
            i++;
        }

        // Cierre del objeto Scanner
        entrada.close();
    }
}
