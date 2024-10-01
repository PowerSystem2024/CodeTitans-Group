/* Ejercicio 12: Pedir un numero y calcular el factoriasl
*/

package Ciclos12;

import java.util.Scanner;

public class Ciclos12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int factorial = 1;
        int num = 0;
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();

        for(int i = num; i > 0 ; i--){
            factorial *= i;
        }
        System.out.println("El factorial de "+num+ " es "+ factorial);
    }
}
