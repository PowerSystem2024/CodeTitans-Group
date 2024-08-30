/*
 * Realizar un juego para adivinar un numero
 * Para ello generar un numero aleatorio entre 0-100
 * Luego ir pidiendo numeros indicando si es mayor o menor
 * Segun sea mayor o menor con respecto a N
 * El proceso termina cuando el usuario acierta
 * Mostramos el numero de intentos hechos
 */

package Java.Clase03.EjerciciosCiclos03;

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random() * 100); // Esto genera un numero aleatorio
        do {
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if (numero < aleatorio) {
                System.out.println("Ingrese un numero mayor");
            } else if (numero > aleatorio) {
                System.out.println("Ingrese un numero menor");
            } else {
                System.out.println("\tFelicidades!!! Adivinaste el numero");
            }
            conteo++;

        } while (numero != aleatorio);

        System.out.println("\tAdivinaste el numero " + conteo + " intentos");
    }
}
