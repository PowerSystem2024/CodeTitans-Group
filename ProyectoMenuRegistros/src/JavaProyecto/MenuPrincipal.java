package JavaProyecto;

import javax.swing.JOptionPane;

public class MenuPrincipal {
    public static int opciones() {
        int opciones;

        do {
            // Crear el menú con opciones  
            opciones = JOptionPane.showOptionDialog(
                    null,
                    "Menu Principal",
                    "Menú",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new Object[]{"Consultar", "Ordenar", "Eliminar", "Ingresar", "Sobre Nosotros", "Terminar"},
                    null
            );


        } while (opciones != 5); // Cambiamos a 5 porque el último índice es "Terminar"  
        return opciones;
    }

    // Métodos de consulta, ordenar, eliminar, ingresar y sobreNosotros deben ser implementados aquí  
}  