/*Ejercicio10: Pedir 10 numeros y escribir la suma total
Hacerlo con la clase Scanner y JOptionPane
*/
package Ciclos10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ciclos10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int suma = 0;
        while (contador < 10){
            System.out.println("Ingrese un numero: ");
            int num = entrada.nextInt();
            contador++;
            suma += num;
        }

        System.out.println("La suma total de los numeros ingresados es: "+ suma);
    }

}
