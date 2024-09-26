/*
 * Pedir un numero y calcular su factorial
 * Hacerlo con las clases Scanner y JOptionPane
 */

package Java.Clase07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
        long factorial = 1; // Inicializamos el factorial en 1 para que no afecte al resultado final
        // System.out.println("Ingrese un numero: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        for (int i = 1; i <= numero; i++) { // Calculamos el factorial del número ingresado
            factorial *= i; // factorial = factorial * i;
        }
        // System.out.println("El factorial de " + numero + " es: " + factorial);
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);

        // entrada.close(); // Cerramos el Scanner
    }

}
