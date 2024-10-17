/*
  Leer numeros hasta que se introdusca un cero
  Para cada uno indicar si es par o impar
  Primero con la clase Scanner, luego con la clase JOptionPane
  
 */

package Java.Clase03.EjerciciosCiclos03;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero ingresado " + numero + " es PAR");
            } else {
                System.out.println("El numero ingresado " + numero + " es IMPAR");
            }
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero ingresado es " + numero + " Finaliza el programa");

        // Cierre del objeto Scanner
        entrada.close();
    }
}
