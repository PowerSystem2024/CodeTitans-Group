/*
 * Leer 10 numero enteros ordenados crecientemente.
 * Leer "N" y buscarlo en la tabla
 * Se debe mostrar la poscion en la que se encuentra, si no esta, avisar con un mensaje
 */

package Java.Clase13.Ejercicio07;

import java.util.Scanner;

public class Arreglos_Ejercicio_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] arreglo = new int[10];
        boolean creciente = true;
        int num, num2 = 0;

        System.out.println("Llenar el arreglo: ");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el numero: ");
                arreglo[i] = entrada.nextInt();
            }

            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("El arreglo no esta desordenado, ingrese nuevamente los datos");
            }
        } while (creciente == false);

        System.out.println("Ingrese el numero a buscar: ");
        num = entrada.nextInt();

        int i = 0;
        while (i < 10 && arreglo[i] < num) {
            i++;
        }

        if (i == 10) {
            System.out.println("El numero " + num + " no se encuentra en el arreglo");
        } else {
            if (arreglo[i] == num) {
                System.out.println("El numero " + num + " se encuentra en la posicion " + i);
            } else {
                System.out.println("El numero " + num + " no se encuentra en el arreglo");
            }
        }

        System.out.println();

        entrada.close();
    }

}
