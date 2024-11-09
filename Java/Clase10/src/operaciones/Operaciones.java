package operaciones;

public class Operaciones {
    //cuando el primer metodo es de tipo publico el segundo no puede ser private
    public static int sumar(int a, int b){
        System.out.println("Metodo para sumar enteros");
        return a + b;
    }

    public static double sumar(double a, double b){
        System.out.println("Metodo para sumar double");
        return a + b;
    }

}
