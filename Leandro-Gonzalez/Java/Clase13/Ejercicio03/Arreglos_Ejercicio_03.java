/*
 * Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
 * Los almacenaremos en una tabla de tamaño 10.
 * Leer un numero N, e insertarlo en la posicion correcta de la tabla, de forma
 * que la tabla continue ordenada.
 */

package Java.Clase13.Ejercicio03;

import java.util.Scanner;

public class Arreglos_Ejercicio_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10]; // Arreglo de 10 elementos
        boolean creciente = true; // Variable para comprobar si el arreglo esta ordenado
        int numero, posicion_num = 0, j = 0; // Var para el nume a insertar, la posicion del nume y el indice

        System.out.println("Llenamos el arreglo: ");
        do {
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese el numero ");
                arreglo[i] = entrada.nextInt(); // Llenamos el arreglo
            }

            // Comprobamos si el arreglos esta ordenado de forma creciente
            for (int i = 0; i < 4; i++) { //
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("El arreglo no esta ordenado de forma creciente, ingrese los numeros nuevamente");
            }
        } while (creciente == false);

        System.out.println("Ingrese el numero a insertar: ");
        numero = entrada.nextInt();

        // Insertamos el numero en la posicion correcta
        while (arreglo[j] < numero && j < 5) {
            posicion_num++;
            j++;
        }

        // Trasladamos una posicion en el arreglos a los elementos que van despues de la
        // posicion
        for (int i = 4; i > posicion_num; i--) {
            arreglo[i + 1] = arreglo[i];
        }

        // Insertamos el numero
        arreglo[posicion_num] = numero;

        System.out.println("El arreglo ordenado es: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i] + " -");
        }
        System.out.println();

        entrada.close();
    }
}
