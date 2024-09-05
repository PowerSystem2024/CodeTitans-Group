/*
Ejercicio 3: leer numeros hasta que se introduzca un cero
para cada uno indicar si es par o impar
primero lo haremos con la clase Scanner
luego con la clase JOptionPane
 */

package Ciclos03;


import javax.swing.*;

public class Ciclos03JOptionPane {
    public static void main(String[] args) {

        int num = 1;

        while (num != 0) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (num == 0){
                JOptionPane.showMessageDialog(null, "El numero ingresado es "+num);
                break;
            }
            if(num % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero "+num+" es par");
            } else {
                JOptionPane.showMessageDialog(null, "El numero "+num+" es impar");
            }


            }

        }

    }

