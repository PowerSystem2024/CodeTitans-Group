/*
 * Leer 10 numeros enteros, almacenarlos en un arreglo
 * Debemos mostrarlos en el siguiente orden:
 * El primero, el ultimo, el segundo, el penultimo, el tercero, etc...
 */

package Java.Clase13.Ejercicio01;

import java.util.Scanner;

public class Arreglos_Ejercicio_01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10]; // Declaramos el arreglo

        for (int i = 0; i < 10; i++) { // Recorremos el arreglo
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt(); // Asignamos el valor ingresado al arreglo
        }

        System.out.println("El arreglo en el orden solicitado es: ");
        for (int i = 0; i < 5; i++) { // Recorremos el arreglo
            System.out.print(arreglo[i] + " "); // Mostramos el valor del arreglo
            System.out.print(arreglo[9 - i] + " "); // Mostramos el valor del arreglo
        }

        System.out.println();

        entrada.close();

    }

}
