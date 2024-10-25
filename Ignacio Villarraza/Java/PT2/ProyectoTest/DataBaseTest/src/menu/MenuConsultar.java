package menu;

import java.util.Scanner; //importamos la clase Scanner

import models.Cliente;
//import servicios.BaseDeDatos; //importamos la clase BaseDeDatos
import servicios.ClienteServicio; //importamos la clase ClienteServicio

//clase MenuConsultar
public class MenuConsultar {

    // private BaseDeDatos baseDeDatos; // llamamos a la clase BaseDeDatos
    private Scanner scanner; // llamamos a la clase Scanner
    private ClienteServicio clienteServicio; // llamamos a la clase ClienteServicio

    /**
     * Constructor de la clase MenuConsultar.
     * 
     * @param baseDeDatos La base de datos de clientes.
     */
    public MenuConsultar(ClienteServicio clienteServicio) {
        // this.baseDeDatos = baseDeDatos;
        this.clienteServicio = clienteServicio;
        scanner = new Scanner(System.in);

    }

    // Muestra el menu de consulta y gestiona las opciones del usuario
    public void mostrarMenu() {
        int opcion; // declaramos la variable opcion
        do {
            System.out.println("\n--- Consultar Clientes ---");
            System.out.println("1. Consultar por Documento");
            System.out.println("2. Listar Todos los Clientes");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    consultarPorDocumento();
                    break;
                case 2:
                    listarTodosLosClientes();
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    // Consulta un cliente por documento
    private void consultarPorDocumento() {
        System.out.print("Ingrese el documento del cliente: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Cliente cliente = clienteServicio.buscarCliente(dni);

        if (cliente != null) {
            System.out.println("\nCliente encontrado:");
            System.out.println(cliente); // Utiliza el método toString() de "Cliente"
        } else {
            System.out.println("\nNo se encontró ningún cliente con ese documento.");
        }

        esperarEnter();
    }

    // Lista todos los clientes de la base de datos
    private void listarTodosLosClientes() {
        clienteServicio.listarClientes();
        esperarEnter();
    }

    // Espera a que el usuario presione Enter
    private void esperarEnter() {
        System.out.println("\nPresione Enter para continuar...");
        scanner.nextLine();
    }
}