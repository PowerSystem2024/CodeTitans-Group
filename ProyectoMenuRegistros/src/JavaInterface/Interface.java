package JavaInterface;

import javax.swing.*;

import JavaProyecto.MenuPrincipal;//importacion de la clase MenuPrincipal creada en javaproyecto
import JavaProyecto.Registros; //importación de la clase Registros creada en javaproyecto

import java.awt.*;

public class Interface {
    public static void main(String[] args) {
        // Crear el marco (ventana)
        JFrame frame = new JFrame("Registro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear un panel con un BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Establecer el layout para el panel
        panel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Establecer el layout para centrar los botones

        // Crear un botón
        JButton button = new JButton("Tamaño de la base de datos");
        button.addActionListener(e -> {
            // Llamar al método cantidadDeRegistros de Registros
            int cantidad = Registros.cantidadDeRegistros();
            // Mostrar el resultado en un JOptionPane
            JOptionPane.showMessageDialog(frame, "Cantidad de registros: " + cantidad);
        });

        JButton button1 = new JButton("Menu Principal");
        button1.addActionListener(e -> {
            int option = MenuPrincipal.opciones();
            JOptionPane.showMessageDialog(frame, "Opcion: " + option);

        });

        // Agregar el botón al panel
        panel.add(button);
        panel.add(button1);
        //espacio entre botones
        panel.add(Box.createVerticalStrut(10));
        // Agregar el panel al marco
        frame.add(panel);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}  