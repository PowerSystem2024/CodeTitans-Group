package ciclowhile;

public class CicloWhile {
    public static void main(String[] args) {
        int conteo = 0; // inferencia de tipos
        while (conteo < 7) {
            System.out.println("conteo = " + conteo);
            conteo++; // vamos aumentando en uno la variable
        }

        int contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 7);

        for (int contando = 0; contando < 7; contando++) {
            System.out.println("contando = " + contando);
        }
    }
}