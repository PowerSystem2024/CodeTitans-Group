/*Ejercicio 11: Diseñar un programa que muestre el producto de los 10
primeros numeros impares
Hacerlo con JOptionPane
*/

package Ciclos11;

import javax.swing.*;

public class Ciclos11 {
    public static void main(String[] args) {

        int producto = 1;
        int num = 1;
        while (num <= 20){

            if (num % 2 != 0){
                producto *= num;
            }
            num += 1;
        }

        JOptionPane.showMessageDialog(null, "El producto de los primeros 10 numeros impares es: "+ producto);
    }



}
