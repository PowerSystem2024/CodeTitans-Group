package Ejercicios;

import java.util.Scanner;

/*
 * Pedir numeros hasta que se teclee un 0
 * Mostrar la suma de todos los numeros ingresados
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(scanner.nextLine());
            suma += numero;
        } while (numero != 0);
        System.out.println("\nLa suma de todos los numeros ingresados es: " + suma);

        // Cierre del objeto Scanner
        scanner.close();
    }
}


