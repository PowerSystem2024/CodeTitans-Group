/*Perdir numeros hasta que se teclee uno negativo
 * Mostrar cuantos numeros se han introducido
 * Primero con la clase Scanner
 * Luego con la clase JOption
 */

package Java.Clase03.EjerciciosCiclos03;

import javax.swing.JOptionPane;

public class Ejercicio02_2 {
    public static void main(String[] args) {
        int numero, conteo = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (numero >= 0) {
            JOptionPane.showInputDialog(null, "El numero " + numero + " es POSITIVO");
            conteo++;
            JOptionPane.showInputDialog(null, "Ingrese otro numero: ");

        }
        JOptionPane.showInputDialog(null, "A ingresado " + conteo + " numeros que son negativos");

    }
}
