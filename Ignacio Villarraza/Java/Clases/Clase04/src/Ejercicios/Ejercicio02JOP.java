/*
 * Pedir numeros hasta que se introduzca uno negativo y calcular el promedio
 * Usamos la clase JOptionPane
 */

package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio02JOP {
    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (numero >= 0) { // Mientras el numero no sea negativo
            suma += numero;
            conteo++;

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        if (conteo == 0) {
            JOptionPane.showMessageDialog(null, "Error, la division entre cero no existe");

        } else {
            promedio = (float) suma / conteo;
            JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);

        }
    }
}
