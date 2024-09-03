package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        while (num >= 0){
            System.out.println("El cuadrado de " +num+ " es " + Math.pow(num, 2));
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }

    }
}
