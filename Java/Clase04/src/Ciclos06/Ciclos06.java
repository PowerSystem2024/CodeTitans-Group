/*
Ejercicio 6: Pedir numero hasta que se teclee un 0, mostrar la suma de todos
los numeros introducidos
 */

package Ciclos06;

import java.util.Scanner;

public class Ciclos06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int entradaUsuario;
        int suma = 0;


        do{
            System.out.println("Ingrese un numero: ");
            entradaUsuario = entrada.nextInt();
            suma += entradaUsuario;

        }while(entradaUsuario != 0);

        System.out.println("La suma de todos los numeros introducidos es "+suma);
    }

}
