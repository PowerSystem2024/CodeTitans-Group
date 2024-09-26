/*
 * Diseñar un programa que muestr el producto de los 10 primeros números impares.
 * Hacerlo con JOptionPane
 */

package Java.Clase07;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int producto = 1; // Inicializamos el producto en 1 para que no afecte al resultado final
        for (int i = 1; i <= 19; i += 2) { // Los primeros 10 números impares son los 10 primeros números naturales
            producto *= i; // producto = producto * i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los primeros números impares es: " + producto);

    }
}
