package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {

        var valorX = 20; //Stack - espacio de memoria que se le asigna a una variable local
        System.out.println("valorX = " + valorX);

        cambioValor(valorX); //solo le enviamos una c
        // opia, el parametro por valor
        //no esta haciendo una manipulacion en el espacio de memoria local
        System.out.println("valorX = " + valorX);
    }

    public static void cambioValor(int arg1){ //parametros por valor

        System.out.println("arg1 = " + arg1);
        arg1 = 30;
    }

}
