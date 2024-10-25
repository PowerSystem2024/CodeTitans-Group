package menu;

//import servicios.BaseDeDatos; // Importa la clase BaseDeDatos para acceder a la base de datos
import servicios.ClienteServicio; // Importa la clase ClienteServicio para realizar operaciones con clientes
import java.util.Scanner; // Importa la clase Scanner para leer datos del usuario
import utils.Validaciones; // Importa la clase Validaciones para validar los datos ingresados por el usuario
import models.Cliente; // Importa la clase Cliente para crear un nuevo cliente

// Clase que contiene el menú de ingresar para un nuevo cliente.
public class MenuIngresar {

    private Scanner scanner; // Instancia de la clase Scanner para leer datos del usuario
    private ClienteServicio clienteServicio; // Instancia de la clase ClienteServicio para realizar operaciones con
                                             // clientes

    /**
     * Constructor de la clase MenuIngresar.
     * 
     * @param clienteServicio Instancia de la clase ClienteServicio para realizar
     *                        operaciones con clientes
     */
    public MenuIngresar(ClienteServicio clienteServicio) { // Constructor de la clase MenuIngresar
        scanner = new Scanner(System.in); // Inicializa el Scanner
        this.clienteServicio = clienteServicio; // Inicializa el servicio de clientes

    }

    /**
     * Muestra el menú para ingresar un nuevo cliente y gestiona la lógica de
     * ingreso.
     */
    public void mostrarMenu() {
        System.out.println("\n--- Ingresar Nuevo Cliente ---");

        int dni = leerDocumento();
        String nombre = leerNombre();
        String apellido = leerApellido();
        String email = leerEmail();
        String fechaNacimiento = leerFechaNacimiento();
        String telefono = leerTelefono();
        String direccion = leerDireccion();
        String codigoPostal = leerCodigoPostal();
        String provincia = leerProvincia();
        double saldo = leerSaldo();
        boolean activo = leerEstado();

        // Crear un nuevo objeto Cliente con los datos ingresados
        Cliente nuevoCliente = new Cliente(dni, nombre, apellido, email, telefono, direccion, codigoPostal,
                provincia, saldo, activo, fechaNacimiento); // Crear un nuevo cliente con los datos ingresados

        // Agregar el cliente a la base de datos
        clienteServicio.agregarCliente(nuevoCliente);

        System.out.println("\nCliente ingresado correctamente.");
        System.out.println(nuevoCliente); // Mostrar los datos del cliente ingresado

        esperarEnter(); // Esperar a que el usuario presione Enter para continuar
    }

    // Métodos para leer los datos del cliente (con validaciones)
    private int leerDocumento() {
        int dni;
        do {
            System.out.print("Ingrese el documento: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido para el documento.");
                scanner.next(); // Consumir la entrada inválida
            }
            dni = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (Validaciones.documentoDuplicado(dni)) {
                System.out.println("Error: El documento ya existe. Ingrese otro documento.");
            }
        } while (Validaciones.documentoDuplicado(dni));
        return dni;
    }

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

    private void esperarEnter() { // Método para esperar a que el usuario presione Enter para continuar
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();
    }
}