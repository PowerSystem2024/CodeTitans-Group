/*
 * Crear una matriz "marco" de tamaño 5x5:
 * todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1.
 * Mostrarla
 */

package Java.Clase13.Ejercicio09;

public class Matriz_Ejercicio_09 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        System.out.println("Rellenando la matriz: ");
        // Llenar la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    matriz[i][j] = 1;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
