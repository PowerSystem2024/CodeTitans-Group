/*
  Leer numeros hasta que se introdusca un cero
  Para cada uno indicar si es par o impar
  Primero con la clase Scanner, luego con la clase JOptionPane
  
 */

package Java.Clase03.EjerciciosCiclos03;

import javax.swing.JOptionPane;

public class ejercicio01_2 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El numero ingresado " + numero + " es PAR");
            } else {
                JOptionPane.showMessageDialog(null, "El numero ingresado " + numero + " es IMPAR");

            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado es " + numero + " Finaliza el programa");
    }

}
