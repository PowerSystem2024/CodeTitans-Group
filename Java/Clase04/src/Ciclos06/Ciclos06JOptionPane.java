package Ciclos06;

import javax.swing.*;
import java.util.Scanner;

public class Ciclos06JOptionPane {

    public static void main(String[] args) {

        int entradaUsuario;
        int suma = 0;


        do{
            entradaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            suma += entradaUsuario;

        }while(entradaUsuario != 0);

        JOptionPane.showMessageDialog(null, "La suma de todos los numeros introducidos es "+suma);
    }
}
