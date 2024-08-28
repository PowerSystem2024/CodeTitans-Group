package Java.Clase02.Ciclos.Ejercicio01_2;

//Importamos JOptionPane para mostrar cuadros de diálogo
import javax.swing.JOptionPane;

public class Ejercicio01_2 {
    public static void main(String[] args) {
        int num, cuadrado;
        // Solicitamos al usuario que ingrese un número utilizando un cuadro de diálogo
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (num >= 0) {
            cuadrado = (int) Math.pow(num, 2);// Calcular el cuadrado del número
            // Mostrar el resultado al usuario
            JOptionPane.showMessageDialog(null, "El número " + num + " elevado al cuadrado es: " + cuadrado);
            System.out.println("El numero " + num + " elevado al cuadrado es: " + cuadrado); // Mostrar el resultado por
                                                                                             // consola
            // Solicitar al usuario que ingrese otro número utilizando un cuadro de diálogo
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        // Mostrar mensaje al usuario si ingresa un numero negativo
        JOptionPane.showMessageDialog(null, "El programa a finalizado por numero negativo");
        // Mensaje al finalizar el bucle cuando se ingresa un número negativo
        System.out.println("El programa a finalizado por numero negativo");
    }
}
