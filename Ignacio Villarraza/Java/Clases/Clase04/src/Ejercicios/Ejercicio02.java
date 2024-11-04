/*
* Pedir numeros hasta que se introduzca uno negativo y calcular el promedio
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(scanner.nextLine());
        while (numero >= 0) { // Mientras el numero no sea negativo
            suma += numero;
            conteo++;
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(scanner.nextLine());
        }
        if (conteo == 0) {
            System.out.println("\nError, la division entre cero no existe");
        } else {
            promedio = (float) suma / conteo;
            System.out.println("\nEl promedio es: " + promedio);
        }

        scanner.close();
    }
}
