/*
 * Leer por teclado 2 tablas de 10 numeros enteros y mezclarlos en una tercera de la
 * siguiente forma:
 * El primer elemento de A
 * El primer elemento de B
 * El segundo elemento de A
 * El segundo elemento de B
 * etc...
 */

package Java.Clase13.Ejercicio02;

import java.util.Scanner;

public class Arreglos_Ejercicio_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaramos los arreglos
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        System.out.println("Llenamos el arreglo A: ");
        // Llenamos el arreglo A
        for (int i = 0; i < 10; i++) { // Recorremos el arreglo A
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            A[i] = entrada.nextInt(); // Asignamos el valor ingresado al arreglo A
        }

        System.out.println("Llenamos el arreglo B: ");
        for (int i = 0; i < 10; i++) { // Recorremos el arreglo B
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            B[i] = entrada.nextInt(); // Asignamos el valor ingresado al arreglo B
        }

        // Llenamos el arreglo C
        int j = 0;
        for (int i = 0; i < 10; i++) { // Recorremos el arreglo C
            C[j] = A[i]; // Asignamos el valor del arreglo A al arreglo C
            j++;
            C[j] = B[i]; // Asignamos el valor del arreglo B al arreglo C
            j++;
        }

        System.out.println("Mostramos el arreglo C: ");
        for (int i = 0; i < 20; i++) { // Recorremos el arreglo C
            System.out.print(C[i] + " "); // Mostramos el valor del arreglo C
        }

        System.out.println();

        entrada.close();
    }
}
