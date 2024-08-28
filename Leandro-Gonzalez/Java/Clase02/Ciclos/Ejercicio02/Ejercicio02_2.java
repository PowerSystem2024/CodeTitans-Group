//Mismo ejercicio que el 2, pero con la clase "JOptionPane"

package Java.Clase02.Ciclos.Ejercicio02;

//Importamos JOptionPane para mostrar cuadros de diálogo
import javax.swing.JOptionPane;

public class Ejercicio02_2 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número utilizando un cuadro de diálogo
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese unnumero"));
        // Bucle que continúa mientras el número ingresado no sea igual a 0
        while (numero != 0) {
            if (numero > 0) { // Si el número es mayor que 0, es positivo
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es POSITIVO");
            } else { // Si el número es menor que 0, es negativo
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es NEGATIVO");
            }
            // Solicitamos al usuario que ingrese otro número para continuar o finalizar el
            // bucle
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        // Mensaje final cuando el número ingresado es 0
        JOptionPane.showMessageDialog(null, "El numero " + numero + "finaliza el programa");

    }
}
