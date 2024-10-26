/*
ejercicio 4: pedir numeros hasta que se teclee uno negativo
y mostrar cuantos numeros se han introducido
 */

package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;
        int i = 0;

        do {
            System.out.println("Ingrese un numero: ");
            num = entrada.nextInt();
            if (num < 0){
                System.out.println("El numero ingresado es "+ num);
                System.out.println("El total de numeros ingresados es: "+i);
                break;
            }
            System.out.println("El numero " +num+ " es positivo");
            i++;
            System.out.println("El total de numeros ingresados es: "+i);

        }while(num >= 0);

    }
}
