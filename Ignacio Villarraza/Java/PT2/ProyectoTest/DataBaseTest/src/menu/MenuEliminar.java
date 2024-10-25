package menu;

import java.util.Scanner;

import models.Cliente;
import servicios.ClienteServicio;

public class MenuEliminar {

    private Scanner scanner; // Scanner para leer datos del usuario
    private ClienteServicio clienteServicio; // Servicio para gestionar clientes

    /**
     * Constructor de la clase MenuEliminar.
     * 
     * @param clienteServicio La instancia de ClienteServicio.
     */
    public MenuEliminar(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio; // Inicializar el servicio de clientes
        scanner = new Scanner(System.in); // Inicializar el scanner
    }

    /**
     * Muestra el menú para eliminar un cliente y gestiona la lógica de
     * eliminación.
     */
    public void mostrarMenu() {
        System.out.println("\n--- Eliminar Cliente ---");
        System.out.print("Ingrese el DNI del cliente a eliminar: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Cliente cliente = clienteServicio.buscarCliente(dni);

        if (cliente != null) {
            System.out.println("\nDatos del cliente:");
            System.out.println(cliente); // Mostrar los datos del cliente

            System.out.print("\n¿Confirma la eliminación del cliente? (s/n): ");
            String confirmacion = scanner.nextLine().toLowerCase(); // Leer la confirmación del usuario

            if (confirmacion.equals("s")) {
                if (clienteServicio.eliminarCliente(dni)) {
                    System.out.println("\nCliente eliminado correctamente.");
                } else {
                    System.out.println("\nError al eliminar el cliente.");
                }
            } else {
                System.out.println("\nEliminación cancelada.");
            }
        } else {
            System.out.println("\nNo se encontró ningún cliente con ese DNI.");
        }

        esperarEnter();
    }

    /**
     * Espera a que el usuario presione Enter para continuar.
     */
    private void esperarEnter() {
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();
    }
}