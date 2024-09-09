import java.util.Scanner;

public class CuadradoNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) { // Ciclo infinito que solo se detendrá con un break
            // Solicitar al usuario que ingrese un número
            System.out.print("Introduce un número entero (negativo para salir): ");
            int numero = scanner.nextInt();

            // Verificar si el número es negativo
            if (numero < 0) {
                System.out.println("Número negativo detectado. Fin del programa.");
                break; // Salir del ciclo si el número es negativo
            }

            // Calcular y mostrar el cuadrado del número
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}