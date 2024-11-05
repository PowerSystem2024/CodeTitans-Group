/* Ejercicio 12: Pedir un numero y calcular el factoriasl
 */
import javax.swing.*;
import java.util.Scanner;

public class Ciclos12JOP {

    public static void main(String[] args) {


        int factorial = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        for(int i = num; i > 0 ; i--){
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null,"El factorial de "+num+ " es "+ factorial);
    }
}