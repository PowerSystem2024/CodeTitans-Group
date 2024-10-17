package Java.Clase10.SobrecargaMetodos.test;

import Java.Clase10.SobrecargaMetodos.operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
        // Creamos variables para utilizar la clase Operaciones
        var resultado = Operaciones.sumar(5, 3); // Se llama al metodo sumar que recibe dos enteros
        System.out.println("resultado = " + resultado);

        var resultado2 = Operaciones.sumar(3.0, 2.0); // Se llama al metodo sumar que recibe dos doubles
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = Operaciones.sumar(3, 2L); // Se llama al metodo sumar que recibe un entero y un long
        System.out.println("resultado3 = " + resultado3); // Al recibir un long, se convierte a double
    }

}
