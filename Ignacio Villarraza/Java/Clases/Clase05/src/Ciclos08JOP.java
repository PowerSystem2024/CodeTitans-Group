import javax.swing.JOptionPane;

public class Ciclos08JOP {

    public static void main(String[] args) {


        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int i = 1;
        while (i <= num) {
            JOptionPane.showMessageDialog(null, i);
            i ++;
        }


    }
}