/*
Ejercicio 8: Pedir numero N, mostrar todos los numeros del 1 al N.
 */

package Ciclos08;


import java.util.Scanner;

public class Ciclos08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();

        for (int i = 1; i <= num;i++){
            System.out.println(i);
        }


        entrada.close();
    }

}
