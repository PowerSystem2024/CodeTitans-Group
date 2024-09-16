/*
ejercicio 4: pedir numeros hasta que se teclee uno negativo
y mostrar cuantos numeros se han introducido
 */

package Ciclos04;

import javax.swing.*;


public class Ciclos04JOptionPane {
    public static void main(String[] args) {


        int num = 1;
        int i = 0;

        while(num >= 0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (num > 0){
                JOptionPane.showMessageDialog(null,"El numero " +num+ " es positivo");
                i++;
                JOptionPane.showMessageDialog(null,"El total de numeros ingresados es: "+i);
            } else {
                JOptionPane.showMessageDialog(null,"El numero ingresado es "+ num);
                JOptionPane.showMessageDialog(null,"El total de numeros ingresados es: "+i);
            }

        }

    }
}
