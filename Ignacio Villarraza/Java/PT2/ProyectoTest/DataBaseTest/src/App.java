
/*
 * Clase principal de la aplicación
 * donde se inicializa la base de datos y se muestra el menú principal
 */

import servicios.BaseDeDatos; // Importa la clase BaseDeDatos para acceder a la base de datos
import menu.MenuPrincipal; // Importa la clase MenuPrincipal

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al Sistema de Administracion de Base de Datos");

        // Crear una instancia de la base de datos
        BaseDeDatos baseDeDatos = new BaseDeDatos(); // Instancia de la base de datos

        // crear una instancia de la clase MenuPrincipal
        MenuPrincipal menuPrincipal = new MenuPrincipal(baseDeDatos); // Instancia de la clase MenuPrincipal

        // Mostrar el menú principal
        menuPrincipal.mostrarMenu(); // Mostrar el menú principal
    }
}
