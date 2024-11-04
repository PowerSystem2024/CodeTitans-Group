package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        Aritmetica suma1 = new Aritmetica();

        suma1.a = 30;
        suma1.b = 20;

        suma1.sumar();

        int resultado = suma1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = suma1.sumarConArgumentos(22, 25);
        System.out.println("Resultado usando argumento = "+ resultado);
    }

}
