package Java.Clase10.SobrecargaMetodos.operaciones;

public class Operaciones {
    public static int sumar(int a, int b) {
        System.out.println("Metodo para suma de enteros");
        return a + b;
    }

    public static double sumar(double a, double b) {
        System.out.println("Metodo para suma de doubles");
        return a + b;
    }

}
