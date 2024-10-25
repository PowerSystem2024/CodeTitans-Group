package servicios;

import java.util.ArrayList;

import models.Cliente;

// Clase que simula una base de datos.
public class BaseDeDatos {

    private ArrayList<Cliente> listaClientes; // Lista de clientes

    // Constructor de la clase BaseDeDatos.
    // Inicializa la lista de clientes con un ArrayList vacío.
    public BaseDeDatos() {
        listaClientes = new ArrayList<>();
    }

    // Método que agrega un cliente a la lista de clientes.
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    /**
     * Elimina un cliente de la lista de clientes por su documento.
     * 
     * @param dni El documento del cliente a eliminar.
     * @return true si el cliente fue eliminado, false si no se encontró un cliente
     *         con ese documento.
     */
    public boolean eliminarCliente(int dni) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getDni() == dni) {
                listaClientes.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Busca un cliente en la lista por su documento.
     * 
     * @param dni El documento del cliente a buscar.
     * @return El cliente si se encontró, null si no se encontró.
     */
    public Cliente buscarCliente(int dni) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getDni() == dni) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Modifica los datos de un cliente existente en la lista.
     * 
     * @param dni               El documento del cliente a modificar.
     * @param clienteModificado El cliente con los datos modificados.
     * @return true si el cliente fue modificado, false si no se encontró un cliente
     *         con ese documento.
     */
    public boolean modificarCliente(int dni, Cliente clienteModificado) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getDni() == dni) {
                listaClientes.set(i, clienteModificado);
                return true;
            }
        }
        return false;
    }

    // Lista todos los clientes en la base de datos.

    public void listarClientes() {
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente); // Utiliza el método toString() de Cliente
        }

    }

    /**
     * Obtiene la lista de clientes.
     * 
     * @return La lista de clientes.
     */

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;

    }
}