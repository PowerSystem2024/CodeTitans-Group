/*
 * Leer por teclado una tabla de 10 elementos numericos enteros y una posicion
 * (entre 0 y 9). Eliminar el elemento situado en la posicion dada sin dejar
 * huecos en el arreglo
 */

package Java.Clase13.Ejercicio04;

import java.util.Scanner;

public class Arreglos_Ejercicio_04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int posicion, j = 0;

        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println();
        do {
            System.out.print("Ingrese la posicion del elemento a eliminar entre (0 y 9): ");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion > 9);

        // Eliminamos el elemento de la posicion dada
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i + 1];
        }

        System.out.println("El arreglo quedo: ");
        for (int i = 0; i < 9; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();

        entrada.close();
    }
}
