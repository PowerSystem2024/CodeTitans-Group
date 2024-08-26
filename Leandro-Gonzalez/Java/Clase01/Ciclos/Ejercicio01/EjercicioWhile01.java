package Java.Clase01.Ciclos.Ejercicio01;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; // Inferencia de tipos
        while (conteo < 3) {
            System.out.println("conteo = " + conteo);
            conteo++; // Vamos aumentando en uno la variable
        }

        // Ciclo do while
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 7);

        // Ciclo for
        for (var contando = 0; contando < 7; contando++) {
            System.out.println("contando = " + contando);
        }

        // Ciclo for con "break"
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) {
                System.out.println("contando = " + contando);
                break;
            }

        }

        // Ciclo for con "continue"
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) {
                continue; // Vamos a la siguiente interacion
            }
            System.out.println("contando = " + contando);
        }

        // Ciclo for con "etiqueta Leabels" (no recomendable)
        inicio: for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) {
                System.out.println("contando = " + contando);
                break inicio;
            }

        }
    }
}
