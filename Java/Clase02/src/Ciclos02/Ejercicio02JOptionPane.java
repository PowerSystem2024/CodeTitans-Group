package Ciclos02;

import javax.swing.JOptionPane;

public class Ejercicio02JOptionPane {
    public static void main(String[] args) {

        int num;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
            if (num > 0){
                System.out.println("El numero "+num+" es positivo");
            }
            else {
                System.out.println("El numero "+num+" es negativo");
            }
        }while (num != 0);
    }
}
