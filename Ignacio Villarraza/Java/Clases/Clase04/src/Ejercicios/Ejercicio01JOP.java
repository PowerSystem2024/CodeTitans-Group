/*
 * Pedir numeros hasta que se teclee un 0
 * Mostrar la suma de todos los numeros ingresados
 * Usamos JOptionPane para este ejercicio
 */
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio01JOP {
    public static void main(String[] args) {
        int numero, suma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            suma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma de todos los numeros ingresados es: " + suma);
    }
}
