package Java.Clase06.POO;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorx = " + valorX);
        cambioValor(valorX); // Solo le enviamos una copia
        System.out.println("valorX = " + valorX);
    }

    public static void cambioValor(int arg1) { // Parametros por valor
        System.out.println("arg1 = " + arg1);
        arg1 = 15; // Le pasamos otro valor pero no lo recibe ya que tenemos una variable local
    }
}
