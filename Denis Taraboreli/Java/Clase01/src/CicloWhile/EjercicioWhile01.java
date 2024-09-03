package CicloWhile;
//Ciclos: repeticion de lineas de codigo, si la sentencia es verdadera, se ejecutara el ciclo
//hasta que la condicion sea falsa
public class EjercicioWhile01 {

    public static void main(String[] args) {

        var conteo = 0; //inferencia de tipos
        while(conteo < 7) {
            System.out.println("conteo = " + conteo);
            conteo++; //vamos aumentando en uno la variable
        }

        var contador = 0;

        do {
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 7);


        for (contador = 0; contador < 7; contador++){
            if(contador % 2 == 0){
                System.out.println("\nPrimer numero par = " + contador);
                break;
            }
        }

        // Etiquetas Labels
        // Nos permiten indicar a la palabra continue y break para ir a un lugar especifico
        //de nuestro programa, no es recomendable aplicarlo porque es la programacion go to
        inicio:
        for (contador = 0; contador < 7; contador++) {
            if (contador % 2 == 0) {
                continue inicio; //si el numero es divisible por 2 no lo mostrara

            }
            System.out.println("Primer numero par = " + contador);
        }

    }
}