/*
 * Utilizando 2 matrices de tamaño 5x9 y 9x5, rellenar la primera y trasponerla en la segunda.
 */

package Java.Clase13.Ejercicio08;

import java.util.Scanner;

public class Matriz_Ejercicio_08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];

        System.out.println("Ingrese la matriz 1: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nLa matriz original es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        // Trasponer la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }

        System.out.println("\nLa matriz traspuesta es: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");

        entrada.close();
    }

}
