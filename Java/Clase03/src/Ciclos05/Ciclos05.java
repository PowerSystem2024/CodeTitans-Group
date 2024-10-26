/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y luego ir pidiendo numeros indicando
"es mayor" o "es menor" segun sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos.
 */
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numUsuario, i = 0;
        int numAleatorio = (int) (Math.random() * 101);
        /*
        otra forma de obtener un numero aleatorio es importando la clase random
        Random random = new Random();
        int numAleatorio = random.nextInt(100);
        */

        do {
            System.out.println("Ingrese un numero: ");
            numUsuario = entrada.nextInt();
            if (numUsuario > numAleatorio){
                System.out.println("El numero "+numUsuario+" es mayor respecto al numero a adivinar");
            } else if (numUsuario < numAleatorio){
                System.out.println("El numero "+numUsuario+" es menor respecto al numero a adivinar");
            }
            i++;
        }while (numAleatorio != numUsuario);

        System.out.println("¡Usted adivino el numero en "+i+" intentos!");



    }
}
