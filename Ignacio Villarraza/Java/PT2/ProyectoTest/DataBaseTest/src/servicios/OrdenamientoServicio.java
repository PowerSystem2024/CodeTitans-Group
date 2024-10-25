package servicios;

import models.Cliente;
import java.util.ArrayList; // Importa la clase ArrayList para poder usar listas
import java.util.Collections; // Importa la clase Collections para poder ordenar listas
import java.util.Comparator; // Importa la clase Comparator para poder comparar objetos

//Clase que implementa los servicios relacionados con el ordenamiento de clientes.
public class OrdenamientoServicio {

    private BaseDeDatos baseDeDatos; // Instancia de la base de datos

    /**
     * Constructor de la clase OrdenamientoServicio.
     * Inicializa la base de datos.
     */
    public OrdenamientoServicio() {
        baseDeDatos = new BaseDeDatos();
    }

    /**
     * Ordena la lista de clientes por el atributo especificado y en el orden
     * especificado.
     * 
     * @param atributo El atributo por el cual se desea ordenar (apellido, activo,
     *                 documento, nombre, saldo).
     * @param orden    El orden de ordenamiento (asc o desc).
     */
    public void ordenarClientes(String atributo, String orden) {
        ArrayList<Cliente> listaClientes = baseDeDatos.getListaClientes(); // Obtiene la lista de clientes

        Collections.sort(listaClientes, new Comparator<Cliente>() {
            @Override // Sobrescribe el método compare de la interfaz Comparator
            public int compare(Cliente cliente1, Cliente cliente2) {
                int resultado = 0;

                switch (atributo) {
                    case "apellido":
                        resultado = cliente1.getApellido().compareToIgnoreCase(cliente2.getApellido());
                        break;
                    case "activo":
                        resultado = Boolean.compare(cliente2.isActivo(), cliente1.isActivo()); // Invierte el orden para
                                                                                               // activo/inactivo
                        break;
                    case "documento":
                        resultado = Integer.compare(cliente1.getDni(), cliente2.getDni());
                        break;
                    case "nombre":
                        resultado = cliente1.getNombre().compareToIgnoreCase(cliente2.getNombre());
                        break;
                    case "saldo":
                        resultado = Double.compare(cliente1.getSaldo(), cliente2.getSaldo());
                        break;
                }

                // Invierte el resultado si el orden es descendente
                return orden.equals("asc") ? resultado : -resultado;
            }
        });
    }

}