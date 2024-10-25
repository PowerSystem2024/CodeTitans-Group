package utils;

import models.Cliente;
import servicios.BaseDeDatos;
import java.util.ArrayList; // Importa la clase ArrayList para trabajar con listas
import java.util.regex.Pattern; // Importa la clase Pattern para usar expresiones regulares
import java.util.regex.Matcher; // Importa la clase Matcher para usar expresiones regulares
import java.time.LocalDate; // Importa la clase LocalDate para trabajar con fechas
import java.time.Period; // Importa la clase Period para trabajar con periodos de tiempo
import java.time.format.DateTimeFormatter; // Importa la clase DateTimeFormatter para formatear fechas
import java.time.format.DateTimeParseException; // Importa la clase DateTimeParseException para manejar errores de formato

// Clase que contiene métodos de validación.

public class Validaciones {

    /**
     * Verifica si un documento ya existe en la base de datos.
     * 
     * @param documento El documento a verificar.
     * @return true si el documento ya existe, false si no existe.
     */
    public static boolean documentoDuplicado(int dni) {
        BaseDeDatos baseDeDatos = new BaseDeDatos(); // Accede a la base de datos
        ArrayList<Cliente> listaClientes = baseDeDatos.getListaClientes();

        for (Cliente cliente : listaClientes) {
            if (cliente.getDni() == dni) {
                return true; // El documento ya existe
            }
        }
        return false; // El documento no existe
    }

    /**
     * Verifica si un nombre es válido (solo letras).
     * 
     * @param nombre El nombre a verificar.
     * @return true si el nombre es válido, false si no lo es.
     */

    public static boolean nombreValido(String nombre) {
        return nombre.matches("[a-zA-Z]+"); // Usa una expresión regular para verificar que solo contenga letras
    }

    /**
     * Verifica si un apellido es válido (solo letras).
     * 
     * @param apellido El apellido a verificar.
     * @return true si el apellido es válido, false si no lo es.
     */
    public static boolean apellidoValido(String apellido) {
        return apellido.matches("[a-zA-Z]+"); // Usa una expresión regular para verificar que solo contenga letras
    }

    /**
     * Verifica si un email es válido (formato correcto).
     * 
     * @param email El email a verificar.
     * @return true si el email es válido, false si no lo es.
     */
    public static boolean emailValido(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; // Expresión regular para validar el formato del email
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * Verifica si un teléfono es válido (formato correcto).
     * 
     * @param telefono El teléfono a verificar.
     * @return true si el teléfono es válido, false si no lo es.
     */
    public static boolean telefonoValido(String telefono) {
        // Puedes ajustar la expresión regular según el formato de teléfono que desees
        // validar
        String regex = "^\\d{10}$"; // Ejemplo: valida un teléfono de 10 dígitos
        return telefono.matches(regex);
    }

    /**
     * Verifica si una fecha de nacimiento es válida (formato dd/mm/aaaa) y si el
     * cliente es mayor de edad.
     * 
     * @param fechaNacimiento La fecha de nacimiento a verificar.
     * @return true si la fecha de nacimiento es válida y el cliente es mayor de
     *         edad, false si no lo es.
     */
    public static boolean fechaNacimientoValida(String fechaNacimiento) {
        // Puedes ajustar la expresión regular según el formato de fecha que desees
        // validar
        String regex = "^\\d{2}/\\d{2}/\\d{4}$"; // Expresión regular para validar el formato dd/mm/aaaa
        if (!fechaNacimiento.matches(regex)) { // Verifica el formato de la fecha
            return false; // Formato inválido
        }

        try { // Intenta convertir la fecha de nacimiento a LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de fecha
            LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter); // Convierte la fecha de nacimiento a
                                                                              // LocalDate
            LocalDate fechaActual = LocalDate.now(); // Obtiene la fecha actual

            Period periodo = Period.between(fechaNac, fechaActual); // Calcula el periodo entre las dos fechas
            int edad = periodo.getYears(); // Obtiene la edad del cliente

            return edad >= 18; // Verifica si es mayor de edad
        } catch (DateTimeParseException e) { // Captura errores de formato
            return false; // Error al convertir la fecha
        }
    }

    /**
     * Verifica si un cliente es mayor de edad, dada su fecha de nacimiento en
     * formato dd/mm/aaaa.
     * 
     * @param fechaNacimiento La fecha de nacimiento del cliente.
     * @return true si el cliente es mayor de edad, false si no lo es.
     */
    public static boolean esMayorDeEdad(String fechaNacimiento) { // Método para verificar si un cliente es mayor de
                                                                  // edad
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de fecha
            LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter); // Convierte la fecha de nacimiento a
                                                                              // LocalDate
            LocalDate fechaActual = LocalDate.now(); // Obtiene la fecha actual

            Period periodo = Period.between(fechaNac, fechaActual); // Calcula el periodo entre las dos fechas
            int edad = periodo.getYears(); // Obtiene la edad del cliente

            return edad >= 18; // Verifica si es mayor de edad
        } catch (DateTimeParseException e) { // Captura errores de formato
            return false; // Error al convertir la fecha
        }
    }

    /**
     * Verifica si una dirección es válida (no vacía).
     * 
     * @param direccion La dirección a verificar.
     * @return true si la dirección es válida, false si no lo es.
     */
    public static boolean direccionValida(String direccion) {
        return !direccion.isEmpty(); // Verifica que la dirección no esté vacía
    }

    /**
     * Verifica si un código postal es válido (formato numerico).
     * 
     * @param codigoPostal El código postal a verificar.
     * @return true si el código postal es válido, false si no lo es.
     */
    public static boolean codigoPostalValido(String codigoPostal) {
        return codigoPostal.matches("\\d+"); // Verifica que el código postal solo contenga dígitos
    }

    /**
     * Verifica si una provincia es válida (no vacía).
     * 
     * @param provincia La provincia a verificar.
     * @return true si la provincia es válida, false si no lo es.
     */
    public static boolean provinciaValida(String provincia) {
        return !provincia.isEmpty(); // Verifica que la provincia no esté vacía
    }

    /**
     * Verifica si un saldo es válido (mayor o igual a cero).
     * 
     * @param saldo El saldo a verificar.
     * @return true si el saldo es válido, false si no lo es.
     */
    public static boolean saldoValido(double saldo) {
        return saldo >= 0; // Verifica que el saldo sea mayor o igual a cero
    }

}
