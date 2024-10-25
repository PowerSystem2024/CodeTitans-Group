package servicios;

import models.Cliente;

//Clase que implemente los servicios relacionados con los clientes.

public class ClienteServicio {

    private BaseDeDatos baseDeDatos; // Base de datos de clientes

    // Constructor de la clase ClienteServicio.
    // Inicializa la base de datos de clientes.
    public ClienteServicio() {
        baseDeDatos = new BaseDeDatos();
    }

    /**
     * Agrega un nuevo cliente a la base de datos.
     * 
     * @param cliente El cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        baseDeDatos.agregarCliente(cliente);
    }

    /**
     * Elimina un cliente de la base de datos por su documento.
     * 
     * @param dni El documento del cliente a eliminar.
     * @return true si el cliente fue eliminado, false si no se encontró un cliente
     *         con ese documento.
     */

    public boolean eliminarCliente(int dni) {
        return baseDeDatos.eliminarCliente(dni);
    }

    /**
     * Busca un cliente en la base de datos por su documento.
     * 
     * @param dni El documento del cliente a buscar.
     * @return El cliente si se encontró, null si no se encontró.
     */
    public Cliente buscarCliente(int dni) {
        return baseDeDatos.buscarCliente(dni);
    }

    /**
     * Modifica los datos de un cliente existente en la base de datos.
     * 
     * @param dni               El documento del cliente a modificar.
     * @param clienteModificado El cliente con los datos modificados.
     * @return true si el cliente fue modificado, false si no se encontró un cliente
     *         con ese documento.
     */
    public boolean modificarCliente(int dni, Cliente clienteModificado) {
        return baseDeDatos.modificarCliente(dni, clienteModificado);
    }

    // lista todos los clientes de la base de datos
    public void listarClientes() {
        baseDeDatos.listarClientes();
    }
}