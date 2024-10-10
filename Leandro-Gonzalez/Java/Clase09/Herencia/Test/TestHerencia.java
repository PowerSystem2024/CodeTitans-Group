package Java.Clase09.Herencia.Test;

import Java.Clase09.Herencia.domain.Empleado;
import Java.Clase09.Herencia.domain.Cliente;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);

        // creamos un objeto de la clase Cliente
        Date fecha1 = new Date(); // fecha actual
        Cliente cliente1 = new Cliente(fecha1, true, "Leandro", 'M', 32, "Junin 123");
        System.out.println("cliente1 = " + cliente1);
    }
}
