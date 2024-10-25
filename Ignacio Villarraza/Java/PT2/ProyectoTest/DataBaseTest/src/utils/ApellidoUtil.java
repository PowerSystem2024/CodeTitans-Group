package utils;

import java.util.Scanner;

public class ApellidoUtil {

  private static Scanner scanner;

  public ApellidoUtil(Scanner scanner) {
    ApellidoUtil.scanner = scanner;
  }

  static public String leerApellido() { // Método para leer el apellido del cliente
    String apellido = "";
    do {
      System.out.print("Ingrese el apellido: ");
      apellido = scanner.nextLine();
      if (!Validaciones.apellidoValido(apellido)) {
        System.out.println("Error: El apellido solo puede contener letras. Ingrese un apellido válido.");
      }
    } while (!Validaciones.apellidoValido(apellido));
    return apellido;
  }

}
