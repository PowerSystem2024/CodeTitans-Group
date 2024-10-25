package test;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;
import java.util.Scanner;

public class TestHerencia {

    public static void main(String[] args) {

        //sino pasamos argumentos, utiliza el de la clase padre(Persona), en este caso esta vacio

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el saldo:");
        double sueldo = entrada.nextDouble();

        entrada.nextLine(); // Consume the leftover newline from nextDouble()
        Empleado empleado1 = new Empleado(nombre, sueldo);
        System.out.println("empleado1 = " + empleado1);


        System.out.println("Ingrese el nombre:");
        String nombre1 = entrada.nextLine();

        System.out.println("Ingrese el direccion:");
        String direccion = entrada.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = entrada.nextInt();

        entrada.nextLine();
        System.out.println("Ingrese el genero:");
        String genero = entrada.nextLine();
        System.out.println("Ingrese si es vip: (true/false)");
        boolean vip = entrada.nextBoolean();


        Cliente cliente1 = new Cliente(nombre1, direccion, edad, genero,new Date(), vip);
        System.out.println("cliente1 = " + cliente1);



    }
}
