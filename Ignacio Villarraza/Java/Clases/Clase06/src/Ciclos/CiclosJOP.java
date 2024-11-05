/*Ejercicio10: Pedir 10 numeros y escribir la suma total
Hacerlo con la clase Scanner y JOptionPane
*/
package Ciclos;


import javax.swing.JOptionPane;

public class CiclosJOP {
    public static void main(String[] args) {


        int suma = 0;

        for(int i = 1; i <= 10; i++){

            int num = Integer.parseInt(JOptionPane.showInputDialog(i +"/10: Ingrese un numero: "));
            suma += num;

        }

        JOptionPane.showMessageDialog(null, "La suma total de los numeros ingresados es: "+ suma);
    }

}