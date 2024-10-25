package menu;

import java.util.Scanner;

import servicios.ClienteServicio;
import servicios.OrdenamientoServicio;

public class MenuOrdenar {

    private Scanner scanner;
    private ClienteServicio clienteServicio;
    private OrdenamientoServicio ordenamientoServicio;

    /**
     * Constructor de la clase MenuOrdenar.
     * 
     * @param clienteServicio La instancia de ClienteServicio.
     */
    public MenuOrdenar(ClienteServicio clienteServicio) {
        scanner = new Scanner(System.in);
        this.clienteServicio = clienteServicio;
        ordenamientoServicio = new OrdenamientoServicio();
    }

    /**
     * Muestra el menú de ordenamiento y gestiona las opciones del usuario.
     */
    public void mostrarMenu() {
        int opcion;
        do {

            System.out.println("\n--- Ordenar Clientes ---");
            System.out.println("1. Por Apellido (ascendente)");
            System.out.println("2. Por Apellido (descendente)");
            System.out.println("3. Por Estado de actividad (activos primero)");
            System.out.println("4. Por Estado de actividad (inactivos primero)");
            System.out.println("5. Por DNI (ascendente)");
            System.out.println("6. Por DNI (descendente)");
            System.out.println("7. Por Nombre (ascendente)");
            System.out.println("8. Por Nombre (descendente)");
            System.out.println("9. Por Saldo (ascendente)");
            System.out.println("10. Por Saldo (descendente)");
            System.out.println("11. Volver al Menú Principal");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    ordenarClientes("apellido", "asc");
                    break;
                case 2:
                    ordenarClientes("apellido", "desc");
                    break;
                case 3:
                    ordenarClientes("activo", "desc"); // Activos primero
                    break;
                case 4:
                    ordenarClientes("activo", "asc"); // Inactivos primero
                    break;
                case 5:
                    ordenarClientes("dni", "asc");
                    break;
                case 6:
                    ordenarClientes("dni", "desc");
                    break;
                case 7:
                    ordenarClientes("nombre", "asc");
                    break;
                case 8:
                    ordenarClientes("nombre", "desc");
                    break;
                case 9:
                    ordenarClientes("saldo", "asc");
                    break;
                case 10:
                    ordenarClientes("saldo", "desc");
                    break;
                case 11:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 11);
    }

    /**
     * Ordena los clientes según el atributo y orden especificados.
     * 
     * @param atributo El atributo por el cual se quiere ordenar.
     * @param orden    El orden de ordenamiento (asc o desc).
     */
    private void ordenarClientes(String atributo, String orden) {
        ordenamientoServicio.ordenarClientes(atributo, orden);
        System.out.println("\nClientes ordenados por " + atributo + " en orden " + orden + ":");
        clienteServicio.listarClientes();
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