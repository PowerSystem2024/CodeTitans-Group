/*
 * Pedir 10 numeros y escribir la suma total
 * Hacerlo con la clase Scanner y JOptionPane
 */

package Java.Clase06.ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }
        System.out.println("\nLa suma de todos los numero es: " + suma);

        entrada.close();
    }
}
