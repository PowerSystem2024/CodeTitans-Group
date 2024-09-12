package Java.Clase04.Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();

        // Creamos una variable para recibir el metodo
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        // Llamamos al metodo y le pasamos los valores
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando Argumentos = " + resultado);
    }
}
