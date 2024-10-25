/*
 * Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla.
 */

package Java.Clase11.Matrices.matriz_ejercicio_1;

import java.util.Scanner;;

public class Matriz_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3]; // Declaramos una matriz de enteros de 3x3

        System.out.println("Rellenar la matriz: ");
        // Bucle for anidado para recorrer las filas (i) y columnas (j) de la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                // Guardamos lo ingresado por el usuario en la posición [i][j] de la matriz
                matriz[i][j] = entrada.nextInt();

            }
        }
        System.out.println();
        // Matriz original
        System.out.println("Matriz Original: ");
        for (int i = 0; i < 3; i++) { // Recorremos las filas
            for (int j = 0; j < 3; j++) { // Recorremos las columnas
                System.out.print(matriz[i][j] + " "); // Imprimimos cada elemento de la fila actual
            }
            System.out.println();
        }
        System.out.println();

        // Matris transpuesta
        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < 3; i++) { // Recorremos las filas de la matriz transpuesta
            for (int j = 0; j < 3; j++) { // Recorremos las columnas de la matriz transpuesta
                System.out.print(matriz[j][i] + " ");// Elemento transpuesto (columna por fila)
            }
            System.out.println();
        }
        System.out.println();
        // Cerramos el scanner
        entrada.close();
    }
}
