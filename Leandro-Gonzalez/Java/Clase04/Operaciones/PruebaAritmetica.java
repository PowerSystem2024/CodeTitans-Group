package Java.Clase04.Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        // var a = 10; // Creamos variables locales
        // int b = 7; // Variables locales "Memoria stack"
        miMetodo(); // Llamamos al nuevo metodo creado

        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();

        // Creamos una variable para recibir el metodo
        // Para almacenar un objeto a los atributos se utiliza la memoria "heap"
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        // Llamamos al metodo y le pasamos los valores
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando Argumentos = " + resultado);

        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        // Usamos el constructor numero 2
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);

        // aritmetica1 = null; nunca utilizar esto
        // System.gc(); Metodo para limpiar residuos, es pesado, no utilizarlo

    }

    public static void miMetodo() {
        // int a = 10; // Una variables esta limitada
        System.out.println("Aqui hay otro metodo");
    }

}
