package Caja;

public class PruebaCaja {

    public static void main(String[] args) {

        //Variables locales
        double medidaAncho = 2.50;
        double medidaAlto = 5.68;
        double medidaProf = 4.23;

        Caja caja1 = new Caja();

        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProf;

        double resultado = caja1.volumen();
        System.out.printf("El volumen de la caja 1 es: %.2f", resultado);

        //Creamos un nuevo objeto y esta vez utilizamos el constructor 2 para pasarle los argumentos de las medidas
        Caja caja2 = new Caja(2.36, 4.48, 6.80);

        System.out.printf("\nEl volumen de la caja 2 es: %.2f", caja2.volumen());
    }
}
