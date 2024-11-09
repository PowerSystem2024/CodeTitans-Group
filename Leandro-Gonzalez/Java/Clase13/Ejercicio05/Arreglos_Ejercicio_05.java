/*
 * Leer 10 numeros enteros en una tabla
 * Guardar en otra tabla los numeros pares de la primera
 * Luego los numeros impares
 */

package Java.Clase13.Ejercicio05;

import java.util.Scanner;

public class Arreglos_Ejercicio_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int contador_pares = 0, contador_impares = 0;

        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero: ");
            arreglo[i] = entrada.nextInt();

            if (arreglo[i] % 2 == 0) {
                contador_pares++;
            } else {
                contador_impares++;
            }
        }

        // creamos los arreglos para los pares y los impares
        int[] pares = new int[contador_pares];
        int[] impares = new int[contador_impares];

        contador_pares = 0; // lo usamos como iteradores
        contador_impares = 0;

        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {
                pares[contador_pares] = arreglo[i];
                contador_pares++;
            } else {
                impares[contador_impares] = arreglo[i];
                contador_impares++;
            }
        }

        System.out.print("\nArreglo Ingresado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.print("\nArreglo de Pares: ");
        for (int i = 0; i < contador_pares; i++) {
            System.out.print(pares[i] + " - ");
        }

        System.out.print("\nArreglo de Impares: ");
        for (int i = 0; i < contador_impares; i++) {
            System.out.print(impares[i] + " - ");
        }
        System.out.println();

        entrada.close();
    }
}
