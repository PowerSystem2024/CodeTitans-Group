package utils;

import java.util.Scanner;

public class Nombre {
  static Scanner scanner; // Instancia clase scanner

  public Nombre(Scanner scanner) {

  }

  public static String leerNombre(String nombre) {

    do {
      if (!Validaciones.nombreValido(nombre)) {
        System.out.println("Error: El nombre solo puede contener letras. Ingrese un nombre válido.");
      }
    } while (!Validaciones.nombreValido(nombre));
    return nombre;
  }
}
