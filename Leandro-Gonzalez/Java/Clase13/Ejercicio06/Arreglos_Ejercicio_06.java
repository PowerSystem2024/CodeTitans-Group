/*
 * Leer 2 series de 10 numeros enteros, que estaran ordenados de forma creciente
 * Fusionar las 2 tablas en una tercera de forma ordenada
 */

package Java.Clase13.Ejercicio06;

import java.util.Scanner;

public class Arreglos_Ejercicio_06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];
        int[] arreglo3 = new int[20];
        boolean creciente = true;

        System.out.println("Llenar el primer arreglo: ");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el numero: ");
                arreglo1[i] = entrada.nextInt();
            }

            // verificamos si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if (arreglo1[i] < arreglo1[i + 1]) { // Creciente 1-2-3
                    creciente = true;
                }
                if (arreglo1[i] > arreglo1[i + 1]) { // Decreciente 3-2-1
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("El arreglo no esta ordenado de forma creciente");
            }

        } while (creciente == false);

        System.out.println("Llenar el segundo arreglo: ");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el numero: ");
                arreglo2[i] = entrada.nextInt();
            }

            // verificamos si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if (arreglo2[i] < arreglo2[i + 1]) {
                    creciente = true;
                }
                if (arreglo2[i] > arreglo2[i + 1]) {
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("El arreglo no esta ordenado de forma creciente");
            }
        } while (creciente == false);

        int i = 0, j = 0, k = 0; // i para el primer arreglo, j para el segundo, k para el tercero

        while (i < 10 && j < 10) {
            if (arreglo1[i] < arreglo2[j]) { // Si el elemento del primer arreglo es menor al del segundo
                arreglo3[k] = arreglo1[i]; // Lo agregamos al tercer arreglo
                i++; // Incrementamos el iterador del primer arreglo
            } else {
                arreglo3[k] = arreglo2[j]; // Copiamos el elemento del segundo arreglo
                j++; // Incrementamos el iterador del segundo arreglo
            }
            k++; // Incrementamos el iterador del tercer arreglo
        }

        // Cuando salimos del while, es porque un arreglos (1 o 2) ya se copio
        // Copiamos el resto del arreglo que no se copio
        if (i == 10) {
            while (j < 10) {
                arreglo3[k++] = arreglo2[j++];
            }
        } else {
            while (i < 10) {
                arreglo3[k++] = arreglo1[i++];
            }
        }

        System.out.println("\nEl arreglo completo es: ");
        for (k = 0; k < 20; k++) {
            System.out.print(arreglo3[k] + " -");
        }
        System.out.println();

        entrada.close();

    }
}
