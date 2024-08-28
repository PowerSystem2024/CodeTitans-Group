/*Ejercicio 1: Leer un numero y mostrar su cuadrado
repetir el proceso hasta que se introduzca un numero negativo */

package Java.Clase02.Ciclos.Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos de entrada del usuario
        Scanner entrada = new Scanner(System.in);

        int num, cuadrado;

        System.out.println("Ingrese un número: "); // Solicitar al usuario que ingrese un número
        num = Integer.parseInt(entrada.nextLine());

        // Bucle que continúa mientras el número ingresado sea mayor o igual a 0
        while (num >= 0) {
            cuadrado = (int) Math.pow(num, 2);// Calcular el cuadrado del número
            System.out.println("El numero " + num + " elevado al cuadrado es: " + cuadrado); // Mostrar el resultado
            System.out.println("Ingrese otro numero: "); // Solicitar al usuario que ingrese otro número
            num = Integer.parseInt(entrada.nextLine());
        }
        // Mensaje al finalizar el bucle cuando se ingresa un número negativo
        System.out.println("El programa a finalizado por numero negativo");

        // Cierre del objeto Scanner
        entrada.close();
    }

}
