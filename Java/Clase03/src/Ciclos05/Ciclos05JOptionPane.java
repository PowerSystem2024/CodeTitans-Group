/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y luego ir pidiendo numeros indicando
"es mayor" o "es menor" segun sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos.
 */
package Ciclos05;


import javax.swing.*;

public class Ciclos05JOptionPane {
    public static void main(String[] args) {


        int numUsuario, i = 0;
        int numAleatorio = (int) (Math.random() * 101);
        /*
        otra forma de obtener un numero aleatorio es importando la clase random
        Random random = new Random();
        int numAleatorio = random.nextInt(100);
        */

        do {
            numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if (numUsuario > numAleatorio){
                JOptionPane.showMessageDialog(null,"El numero "+numUsuario+" es mayor respecto al numero a adivinar");
            } else if (numUsuario < numAleatorio){
                JOptionPane.showMessageDialog(null,"El numero "+numUsuario+" es menor respecto al numero a adivinar");
            }
            i++;
        }while (numAleatorio != numUsuario);

        JOptionPane.showMessageDialog(null,"¡Usted adivino el numero en "+i+" intentos!");



    }
}
