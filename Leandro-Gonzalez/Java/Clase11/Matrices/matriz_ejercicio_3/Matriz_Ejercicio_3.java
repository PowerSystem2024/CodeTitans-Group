/*
 * Crear y cargar una matriz de tamaño "n x m"
 * Mostrar la suma de cada fila y de cada columna
 */

package Java.Clase11.Matrices.matriz_ejercicio_3;

import java.util.Scanner;

public class Matriz_Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que ingrese el tamaño de la matriz
        System.out.print("Ingrese el número de filas (n): ");
        int n = entrada.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = entrada.nextInt();

        // Declaramos una matriz de enteros de tamaño n x m
        int matriz[][] = new int[n][m];

        // for anidado para rellenar la matriz con los valores introducidos
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) { // Recorremos las filas
            for (int j = 0; j < m; j++) { // Recorremos las columnas
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt(); // Almacenamos el valor en la posición [i][j]
            }
        }

        // Calculamos y mostramos la suma de cada fila
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < n; i++) { // Recorremos cada fila de la matriz
            int sumaFila = 0; // Inicializamos la suma de la fila actual en 0
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j]; // Sumamos los elementos de la fila
            }
            System.out.println("Suma de la fila " + i + ": " + sumaFila);
        }

        // Calculamos y mostramos la suma de cada columna
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < m; j++) { // Recorremos cada columna de la matriz
            int sumaColumna = 0; // Inicializamos la suma de la columna actual en 0
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j]; // Sumamos los elementos de la columna
            }
            System.out.println("Suma de la columna " + j + ": " + sumaColumna);
        }

        // Cerramos el Scanner
        entrada.close();
    }

}
