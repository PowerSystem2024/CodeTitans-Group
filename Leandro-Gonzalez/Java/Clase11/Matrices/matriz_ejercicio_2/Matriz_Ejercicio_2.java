/*
 * Crear una matriz de tamaño 7x7 y 
 * rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0.
 */

package Java.Clase11.Matrices.matriz_ejercicio_2;

public class Matriz_Ejercicio_2 {
    public static void main(String[] args) {

        // Declaramos una matriz de enteros de 7x7
        int matriz[][] = new int[7][7];

        // Bucle for anidado para rellenar la matriz con los valores deseados
        for (int i = 0; i < 7; i++) { // Recorremos las filas de la matriz
            for (int j = 0; j < 7; j++) { // Recorremos las columnas de la matriz
                // Condicional para verificar si la posición actual está en la diagonal
                // principal
                if (i == j) {
                    matriz[i][j] = 1; // Asignamos 1 en la diagonal principal
                } else {
                    matriz[i][j] = 0; // Asignamos 0 en las demás posiciones
                }
            }
        }

        System.out.println("\nMatriz completa :");
        for (int i = 0; i < 7; i++) { // Recorremos las filas de la matriz
            for (int j = 0; j < 7; j++) { // Recorremos las columnas de la matriz
                System.out.print(matriz[i][j] + " "); // Imprimimos cada elemento seguido de un espacio
            }
            System.out.println("");
        }

    }

}
