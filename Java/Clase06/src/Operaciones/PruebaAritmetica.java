package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        //el alcance de variables locales es dentro de un metodo

        int a = 10; //variable locales
        int b = 7;
        miMetodo();//llamamos al metodo nuevo

        Aritmetica aritmetica1 = new Aritmetica(); //Aqui estabamos usando el constructor por defecto

        aritmetica1.a = 50;
        aritmetica1.b = 30;

        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);


        //Para almacenar un objeto o los atributos se utiliza la memoria heap

        resultado = aritmetica1.sumarConArgumentos(12, 15);
        System.out.println("Resultado usando argumento = "+ resultado);


        //aqui ya tenemos una asignacion, que son los usados en aritmetica1.sumarConArgumentos

        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);


        //aqui usamos el constructor 2
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 " + aritmetica2.a);
        System.out.println("aritmetica2 " + aritmetica2.b);

        int resultado2 = aritmetica2.sumarConRetorno();
        System.out.println("resultado = " + resultado2);
        //aritmetica1 = null, nunca utilizar esto, no se debe hacer
        //System.gc(); metodo para limpiar residuos, es pesado, no utilizar
    }

    public static void miMetodo(){
        int a = 10;
        System.out.println("Aqui hay otro metodo");
    }



}



