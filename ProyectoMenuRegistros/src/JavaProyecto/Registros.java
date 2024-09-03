package JavaProyecto;
import javax.swing.JOptionPane;

public class Registros {
    public static int cantidadDeRegistros(){
        boolean continuar;
        continuar = true;
        int registros = 0;
        do{
            try{
                registros = Integer.parseInt(JOptionPane.showInputDialog("===== > Creando la base de datos. " +
                    "< =====\nLa capacidad de la base de datos es de 10 registros máximos.\nDefina cuántos registros " +
                    "tendra la base de datos."));
                if (registros < 1 || registros > 10){
                    continuar = false;
                    JOptionPane.showMessageDialog(null,"El numero ingresado supera la capacidad de la base de datos");
                }else {
                    continuar = true;
                }
            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            };
        }while (continuar != true);

        return registros;
    }

}
