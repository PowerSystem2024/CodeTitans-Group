/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo. el proceso se repetira
hasta que se introduzca un cero
 */
package Ciclos02;


import java.util.Scanner;


public class Ejercicios02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num = 1;
        while (num != 0) {
            System.out.println("Introduce un numero: ");
            num = entrada.nextInt();
            if (num > 0) {
                System.out.println("El numero " + num + " es positivo");
            } else {
                System.out.println("El numero " + num + " es negativo");
            }
        }


    }
}