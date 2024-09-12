//Pedir un numero N y mostrar todos los numeros del 1 al N.
//Ejercicio con "JOptionPane"

package Java.Clase05.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int i = 1;
        while (i <= numero) {
            JOptionPane.showMessageDialog(null, i);
            i++;
        }
    }
}
