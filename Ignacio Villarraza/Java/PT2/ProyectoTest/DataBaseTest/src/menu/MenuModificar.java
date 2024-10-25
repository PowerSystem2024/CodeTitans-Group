package menu;

import java.util.Scanner;

import models.Cliente;
import servicios.ClienteServicio;
import utils.Validaciones;

public class MenuModificar {

    private Scanner scanner;
    private ClienteServicio clienteServicio;

    /**
     * Constructor de la clase MenuModificar.
     * 
     * @param baseDeDatos La base de datos de clientes.
     */
    public MenuModificar(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
        scanner = new Scanner(System.in);
    }

    /**
     * Muestra el menú para modificar un cliente y gestiona la lógica de
     * modificación.
     */
    public void mostrarMenu() {
        int opcion;
        do {

            System.out.println("\n--- Modificar Cliente ---");
            System.out.println("1. Modificar datos principales");
            System.out.println("2. Modificar todos los datos (excepto DNI)");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    modificarDatosPrincipales();
                    break;
                case 2:
                    modificarTodosLosDatos();
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    // usamos los metodos de validaciones para validar los datos ingresados por el
    // usuario
    // son los mismos metodos que se usan en el menu ingresar

    private String leerNombre() { // Método para leer el nombre del cliente
        String nombre;
        do {
            System.out.print("Ingrese el nombre: ");
            nombre = scanner.nextLine();
            if (!Validaciones.nombreValido(nombre)) {
                System.out.println("Error: El nombre solo puede contener letras. Ingrese un nombre válido.");
            }
        } while (!Validaciones.nombreValido(nombre));
        return nombre;
    }

    private String leerApellido() { // Método para leer el apellido del cliente
        String apellido;
        do {
            System.out.print("Ingrese el apellido: ");
            apellido = scanner.nextLine();
            if (!Validaciones.apellidoValido(apellido)) {
                System.out.println("Error: El apellido solo puede contener letras. Ingrese un apellido válido.");
            }
        } while (!Validaciones.apellidoValido(apellido));
        return apellido;
    }

    private String leerEmail() { // Método para leer el email del cliente
        String email;
        do {
            System.out.print("Ingrese el email: ");
            email = scanner.nextLine();
            if (!Validaciones.emailValido(email)) {
                System.out.println("Error: El formato del email es inválido. Ingrese un email válido.");
            }
        } while (!Validaciones.emailValido(email));
        return email;
    }

    // Método para leer la fecha de nacimiento del cliente
    private String leerFechaNacimiento() {
        String fechaNacimiento;
        do {
            System.out.print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
            fechaNacimiento = scanner.nextLine();
            if (!Validaciones.fechaNacimientoValida(fechaNacimiento)) {
                System.out.println(
                        "Error: Formato de fecha inválido o cliente menor de edad. Ingrese una fecha válida (dd/mm/aaaa).");
            }
        } while (!Validaciones.fechaNacimientoValida(fechaNacimiento));
        return fechaNacimiento;
    }

    private String leerTelefono() { // Método para leer el teléfono del cliente
        String telefono;
        do {
            System.out.print("Ingrese el teléfono: ");
            telefono = scanner.nextLine();
            if (!Validaciones.telefonoValido(telefono)) {
                System.out.println("Error: El formato del teléfono es inválido. Ingrese un teléfono válido.");
            }
        } while (!Validaciones.telefonoValido(telefono));
        return telefono;
    }

    private String leerDireccion() { // Método para leer la dirección del cliente
        String direccion;
        do {
            System.out.print("Ingrese la dirección: ");
            direccion = scanner.nextLine();
            if (!Validaciones.direccionValida(direccion)) {
                System.out.println("Error: La dirección no puede estar vacía. Ingrese una dirección válida.");
            }
        } while (!Validaciones.direccionValida(direccion));
        return direccion;
    }

    private String leerCodigoPostal() { // Método para leer el código postal del cliente
        String codigoPostal;
        do {
            System.out.print("Ingrese el código postal: ");
            codigoPostal = scanner.nextLine();
            if (!Validaciones.codigoPostalValido(codigoPostal)) {
                System.out
                        .println(
                                "Error: El código postal solo puede contener números. Ingrese un código postal válido.");
            }
        } while (!Validaciones.codigoPostalValido(codigoPostal));
        return codigoPostal;
    }

    private String leerProvincia() { // Método para leer la provincia del cliente
        String provincia;
        do {
            System.out.print("Ingrese la provincia: ");
            provincia = scanner.nextLine();
            if (!Validaciones.provinciaValida(provincia)) {
                System.out.println("Error: La provincia no puede estar vacía. Ingrese una provincia válida.");
            }
        } while (!Validaciones.provinciaValida(provincia));
        return provincia;
    }

    private double leerSaldo() { // Método para leer el saldo del cliente
        double saldo;
        do {
            System.out.print("Ingrese el saldo: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Ingrese un número válido para el saldo.");
                scanner.next(); // Consumir la entrada inválida
            }
            saldo = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            if (!Validaciones.saldoValido(saldo)) {
                System.out.println("Error: El saldo debe ser mayor o igual a cero. Ingrese un saldo válido.");
            }
        } while (!Validaciones.saldoValido(saldo));
        return saldo;
    }

    private boolean leerEstado() { // Método para leer el estado del cliente (activo o inactivo)
        boolean activo;
        do {
            System.out.print("¿El cliente está activo? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals("s")) {
                activo = true;
            } else if (respuesta.equals("n")) {
                activo = false;
            } else {
                System.out.println("Error: Ingrese 's' para activo o 'n' para inactivo.");
                activo = false; // Para que el bucle continúe
            }
        } while (!activo && !scanner.nextLine().toLowerCase().equals("n"));
        return activo;
    }

    /**
     * Permite al usuario modificar los datos principales de un cliente.
     */
    private void modificarDatosPrincipales() {
        System.out.print("Ingrese el DNI del cliente a modificar: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Cliente cliente = clienteServicio.buscarCliente(dni);

        if (cliente != null) {
            System.out.println("\nDatos actuales del cliente:");
            mostrarDatosCliente(cliente);

            // Modificar email
            System.out.print("\n¿Desea modificar el email? (s/n): ");
            if (scanner.nextLine().toLowerCase().equals("s")) {
                cliente.setEmail(leerEmail());
            }

            // Modificar teléfono
            System.out.print("¿Desea modificar el teléfono? (s/n): ");
            if (scanner.nextLine().toLowerCase().equals("s")) {
                cliente.setTelefono(leerTelefono());
            }

            // Modificar dirección
            System.out.print("¿Desea modificar la dirección? (s/n): ");
            if (scanner.nextLine().toLowerCase().equals("s")) {
                cliente.setDireccion(leerDireccion());
            }

            // Modificar saldo
            System.out.print("¿Desea modificar el saldo? (s/n): ");
            if (scanner.nextLine().toLowerCase().equals("s")) {
                cliente.setSaldo(leerSaldo());
            }

            // Confirmar modificación
            System.out.println("\nDatos modificados del cliente:");
            mostrarDatosCliente(cliente);
            System.out.print("¿Confirma la modificación? (s/n): ");
            if (scanner.nextLine().toLowerCase().equals("s")) {
                if (clienteServicio.modificarCliente(dni, cliente)) {
                    System.out.println("\nCliente modificado correctamente.");
                } else {
                    System.out.println("\nError al modificar el cliente.");
                }
            } else {
                System.out.println("\nModificación cancelada.");
            }
        } else {
            System.out.println("\nNo se encontró ningún cliente con ese DNI.");
        }

        esperarEnter();
    }

    /**
     * Permite al usuario modificar todos los datos de un cliente (excepto el DNI).
     */
    private void modificarTodosLosDatos() {
        System.out.print("Ingrese el DNI del cliente a modificar: ");
        int dni = scanner.nextInt(); // Leer el DNI del cliente a modificar
        scanner.nextLine(); // Consumir el salto de línea

        Cliente cliente = clienteServicio.buscarCliente(dni); // Buscar el cliente en la base de datos

        if (cliente != null) { // Si se encontró el cliente
            System.out.println("\nDatos actuales del cliente:");
            mostrarDatosCliente(cliente); // Mostrar los datos actuales del cliente

            // Leer y actualizar todos los datos (excepto DNI)
            cliente.setNombre(leerNombre());
            cliente.setApellido(leerApellido());
            cliente.setEmail(leerEmail());
            cliente.setTelefono(leerTelefono());
            cliente.setDireccion(leerDireccion());
            cliente.setCodigoPostal(leerCodigoPostal());
            cliente.setProvincia(leerProvincia());
            cliente.setSaldo(leerSaldo());
            cliente.setActivo(leerEstado());
            cliente.setFechaNacimiento(leerFechaNacimiento());

            // Confirmar modificación
            System.out.println("\nDatos modificados del cliente:");
            mostrarDatosCliente(cliente);
            System.out.print("¿Confirma la modificación? (s/n): ");
            if (scanner.nextLine().toLowerCase().equals("s")) {
                if (clienteServicio.modificarCliente(dni, cliente)) {
                    System.out.println("\nCliente modificado correctamente.");
                } else {
                    System.out.println("\nError al modificar el cliente.");
                }
            } else {
                System.out.println("\nModificación cancelada.");
            }
        } else {
            System.out.println("\nNo se encontró ningún cliente con ese DNI.");
        }

        esperarEnter();
    }

    // Métodos para leer los datos del cliente (reutilizados de MenuIngresar.java)
    /**
     * Muestra los datos de un cliente (excepto el DNI).
     * 
     * @param cliente El cliente a mostrar.
     */

    private void mostrarDatosCliente(Cliente cliente) {
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Código Postal: " + cliente.getCodigoPostal());
        System.out.println("Provincia: " + cliente.getProvincia());
        System.out.println("Saldo: " + cliente.getSaldo());
        System.out.println("Activo: " + cliente.isActivo());
        System.out.println("Fecha de Nacimiento: " + cliente.getFechaNacimiento());
    }

    /**
     * Espera a que el usuario presione Enter para continuar.
     */
    private void esperarEnter() {
        System.out.print("\nPresione Enter para continuar...");
        scanner.nextLine();
    }

}