/*
 * Pedir numeros hasta que se teclee un 0
 * Mostrar la suma de todos los numeros ingresados
 */

package Java.Clase04.Ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        } while (numero != 0);
        System.out.println("\nLa suma de todos los numeros ingresados es: " + suma);

        // Cierre del objeto Scanner
        entrada.close();
    }

}
