/*
 * Leer 5 numeros por teclado, almacenarlos en un arreglo
 * A continuacion realizar la media de los numeros positivos, negativos y contar el
 * numero de ceros.
 */

package arreglos_ejercicio_3;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Scanner para leer la entrada desde el teclado
        Scanner entrada = new Scanner(System.in);

        // Declaramos un arreglo de tipo float con capacidad para 5 elementos
        float numeros[] = new float[5];

        // Variables para almacenar la suma de números positivos, negativos y la cuenta
        // de ceros
        float sumaPositivos = 0, sumaNegativos = 0;
        int conteoPositivos = 0, conteoNegativos = 0, conteoCeros = 0;

        System.out.println("Almacenando datos en el arreglo");

        // Ciclo for para recorrer las 5 posiciones del arreglo y llenarlo con números
        // introducidos por el usuario
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Ingrese un numero: ");
            numeros[i] = entrada.nextFloat(); // Almacenamos cada número en el arreglo

            // Clasificamos los números según sean positivos, negativos o ceros
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i]; // Suma los números positivos
                conteoPositivos++; // Cuenta los números positivos
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i]; // Suma los números negativos
                conteoNegativos++; // Cuenta los números negativos
            } else {
                conteoCeros++; // Cuenta los ceros
            }
        }

        // Calculo de la media de los numeros positivos
        float mediaPositivos;
        if (conteoPositivos == 0) {
            mediaPositivos = 0; // Si no hay números positivos, la media es 0
        } else {
            mediaPositivos = sumaPositivos / conteoPositivos; // Si hay numeros positivos, calculamos la media
        }

        // Calculo de la media de los numeros negativos
        float mediaNegativos;
        if (conteoNegativos == 0) {
            mediaNegativos = 0; // Si no hay numeros negativos, la media es 0
        } else {
            mediaNegativos = sumaNegativos / conteoNegativos; // Si hay numeros negativos, calculamos la media
        }

        // Imprimir resultados
        System.out.println("\nResultados:");
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + conteoCeros);

        // Cerramos el Scanner
        entrada.close();
    }
}
