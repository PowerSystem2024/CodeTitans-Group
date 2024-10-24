/*
 * Leer 5 numeros, guardarlos en un arreglo
 * Mostrar en el orden inverso al introducirlos
 */

package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Scanner para leer la entrada desde el teclado
        Scanner entrada = new Scanner(System.in);

        // Declaramos un arreglo de tipo float con capacidad para 5 elementos
        float[] arreglos = new float[5];

        System.out.println("Almacenando datos en el arreglo");

        // Ciclo for para recorrer las 5 posiciones
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Ingrese un numero: ");
            arreglos[i] = entrada.nextFloat(); // Almacenamos cada número en el arreglo
        }

        System.out.println("\nImprimir los elementos del arreglo en orden inverso");

        // Ciclo for para recorrer el arreglo desde el último índice hasta el primero
        for (int i = 4; i >= 0; i--) { // Comienza desde el índice 4 (última posición) y termina en 0 (primera
                                       // posición)
            System.out.println(arreglos[i] + " ");
        }
        System.out.println("\n");

        // Cerramos el Scanner
        entrada.close();
    }
}
