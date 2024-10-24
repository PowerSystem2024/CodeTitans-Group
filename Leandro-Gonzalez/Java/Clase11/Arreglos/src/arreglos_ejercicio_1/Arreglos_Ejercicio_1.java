/*
 * Leer 5 numeros, guardarlos en un arreglo
 * mostrarlos en el mismo orden introducidos
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Scanner para leer la entrada desde el teclado
        Scanner entrada = new Scanner(System.in);

        // Declaramos un arreglo de tipo float con capacidad para 5 elementos
        float[] arreglos = new float[5];

        System.out.println("Almacenando datos en el arreglo");
        // Ciclo for para recorrer las 5 posiciones del arreglo
        for (int i = 0; i < 5; i++) {
            // Pedimos al usuario que ingrese un número y lo almacenamos en la posición i
            // del arreglo
            System.out.print((i + 1) + ". Ingrese un numero: ");
            arreglos[i] = entrada.nextFloat();
        }

        System.out.println("\nImprimir los elementos del arreglo");
        // Ciclo for para recorrer cada elemento del arreglo e imprimirlo
        for (float i : arreglos) {
            System.out.println(i + " ");
        }
        System.out.println("\n");

        // Cerramos el scanner
        entrada.close();
    }
}