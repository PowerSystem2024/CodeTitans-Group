package menu;

import servicios.BaseDeDatos; // Importa la clase BaseDeDatos para acceder a la base de datos
import java.util.Scanner; // Importa la clase Scanner para leer datos del usuario
import servicios.ClienteServicio; // Importa la clase ClienteServicio para realizar operaciones con clientes

// Clase que contiene el menú principal del programa.

public class MenuPrincipal {

    // private BaseDeDatos baseDeDatos; // Instancia de la base de datos
    private Scanner scanner; // Instancia de la clase Scanner para leer datos del usuario
    private ClienteServicio clienteServicio; // llamamos a la clase ClienteServicio
    // Constructor de la clase MenuPrincipal.
    // Inicializa la base de datos y el Scanner.

    public MenuPrincipal(BaseDeDatos baseDeDatos) { // Constructor de la clase MenuPrincipal
        // this.baseDeDatos = baseDeDatos; // Inicializa la base de datos
        // baseDeDatos = new BaseDeDatos(); // Inicializa la base de datos
        scanner = new Scanner(System.in); // Inicializa el Scanner
        clienteServicio = new ClienteServicio(); // Inicializa el servicio de clientes
    }

    // Método que muestra el menú principal y lee la opción seleccionada por el
    // usuario.
    public void mostrarMenu() {
        int opcion; // Opción seleccionada por el usuario

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Consultar Clientes");
            System.out.println("2. Ordenar Clientes");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Ingresar Cliente");
            System.out.println("5. Modificar Cliente");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt(); // Leer la opción seleccionada por el usuario
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Llamar al menú de consultar clientes
                    MenuConsultar menuConsultar = new MenuConsultar(clienteServicio);
                    menuConsultar.mostrarMenu();
                    break;
                case 2:
                    // Llamar al menú de ordenar clientes
                    MenuOrdenar menuOrdenar = new MenuOrdenar(clienteServicio);
                    menuOrdenar.mostrarMenu();
                    break;
                case 3:
                    // Llamar al menú de eliminar cliente
                    MenuEliminar menuEliminar = new MenuEliminar(clienteServicio);
                    menuEliminar.mostrarMenu();
                    break;
                case 4:
                    // Llamar al menú de ingresar cliente
                    MenuIngresar menuIngresar = new MenuIngresar(clienteServicio);
                    menuIngresar.mostrarMenu();
                    break;
                case 5:
                    // Llamar al menú de modificar cliente
                    MenuModificar menuModificar = new MenuModificar(clienteServicio);
                    menuModificar.mostrarMenu();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close(); // Cerrar el Scanner
    }

}