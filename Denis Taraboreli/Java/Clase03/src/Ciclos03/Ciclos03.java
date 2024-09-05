/*
Ejercicio 3: leer numeros hasta que se introduzca un cero
para cada uno indicar si es par o impar
primero lo haremos con la clase Scanner
luego con la clase JOptionPane
 */

package Ciclos03;
import java.util.Scanner;


public class Ciclos03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;

        do {
            System.out.println("Ingrese un numero: ");
            num = Integer.parseInt(entrada.nextLine());
            if(num % 2 == 0){
                System.out.println("El numero "+num+" es par");
            }else {
                System.out.println("El  numero "+num+" es impar");
            }
        } while(num != 0);
        System.out.println("El numero ingresado es "+num);
    }
}
