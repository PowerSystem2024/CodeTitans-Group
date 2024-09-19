/*
 * Pedir 10 numeros y escribir la suma total
 * Hacerlo con la clase Scanner y JOptionPane
 */

package Java.Clase06.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio02 {
    public static void main(String[] args) {
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los numero es: " + suma);
    }
}
