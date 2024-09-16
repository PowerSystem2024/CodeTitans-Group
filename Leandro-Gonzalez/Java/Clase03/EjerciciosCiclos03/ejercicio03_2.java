/*
 * Realizar un juego para adivinar un numero
 * Para ello generar un numero aleatorio entre 0-100
 * Luego ir pidiendo numeros indicando si es mayor o menor
 * Segun sea mayor o menor con respecto a N
 * El proceso termina cuando el usuario acierta
 * Mostramos el numero de intentos hechos
 */

package Java.Clase03.EjerciciosCiclos03;

import javax.swing.JOptionPane;

public class Ejercicio03_2 {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random() * 100); // Esto genera un numero aleatorio
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if (numero < aleatorio) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero mayor");
            } else if (numero > aleatorio) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero menor");
            } else {
                JOptionPane.showMessageDialog(null, "Felicidades!!! Adivinaste el numero");
            }
            conteo++;

        } while (numero != aleatorio);

        JOptionPane.showMessageDialog(null, "Adivinaste el numero " + conteo + " intentos");
    }

}
