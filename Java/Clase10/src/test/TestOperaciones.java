package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {

        var resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(2.05, 3.69);
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = Operaciones.sumar(2, 3L);
        System.out.println("resultado2 = " + resultado3);

    }
}
