/*
Ejercicio 9: pedir el dia, mes y año de una fecha, indicar si
la fecha es correcta. Suponiendo que todos los meses son de 30
dias
 */

package Ciclos09;

import javax.swing.*;

public class Ciclos09JOptionPane {

    public static void main(String[] args) {


        int dia, mes, anio;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if ((dia >= 1) && (dia <= 30)) {
            if ((mes >= 1) && (mes <= 12)){
                if ((anio >= 1) && (anio <= 2024)) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es : " + dia + "/" + mes + "/" + anio);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Fecha incorrecta");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Fecha incorrecta");
        }

    }
}
