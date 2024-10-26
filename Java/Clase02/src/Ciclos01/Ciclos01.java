/*
Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso
hasta que se introduzca un numero negativo
 */
package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        int num = Integer.parseInt(entrada.nextLine());
        while(num >= 0){
            System.out.println("El cuadrado de " +num+ " es " +Math.pow(num, 2));
            System.out.println("Digite un numero: ");
            num = Integer.parseInt(entrada.nextLine());
        }

        num = 0;
        // Usando bucle while
        while(num >= 0){
            System.out.println("Escribe un numero:");
            num = Integer.parseInt(entrada.nextLine());
            if(num < 0){
                break;
            }
            System.out.println("El cuadrado es: " + Math.pow(num, 2));
        }


        //Usando un bucle for

        for (;;) { // esto crea un loop infinito
            System.out.println("Escribe un numero:");
            num = entrada.nextInt();
            if (num < 0) {
                break; // Salir del bucle si el número es negativo
            }
            System.out.println("El cuadrado es: " + Math.pow(num, 2));
        }

        //do while

        do {
            System.out.println("Escribe un numero:");
            num = entrada.nextInt();
            if (num < 0){
                break;
            }
            System.out.println("El cuadrado es: " + Math.pow(num, 2));
        } while (num >= 0);

    }
}