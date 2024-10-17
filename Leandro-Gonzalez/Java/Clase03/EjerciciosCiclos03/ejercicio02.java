/*
 *Perdir numeros hasta que se teclee uno negativo
 * Mostrar cuantos numeros se han introducido
 * Primero con la clase Scanner
 * Luego con la clase JOption
 */

package Java.Clase03.EjerciciosCiclos03;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            System.out.println("El numero " + numero + " es POSITIVO");
            conteo++;
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("A ingresado " + conteo + " numeros que son negativos");

        // Cierre del objeto Scanner
        entrada.close();
    }

}
