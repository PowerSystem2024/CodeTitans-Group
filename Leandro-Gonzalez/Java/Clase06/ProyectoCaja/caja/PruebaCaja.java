package Java.Clase06.ProyectoCaja.caja;

public class PruebaCaja {
    public static void main(String[] args) { // Metodo main
        // Variables locales
        int medidaAncho = 3; // Valores ingresados en codigo duro
        int medidaAlto = 2;
        int medidaProfundidad = 6;

        // Instaciamos el objeto (constructor vacio)
        Caja caja1 = new Caja();

        // Le pasamos los valores al abojeto
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProfundidad;

        // Llamamos al metodo
        int resultado = caja1.calcularVolumen();

        // Primer resultado
        System.out.println("Resultado volumen de caja 1: " + resultado);

        // Llamamos al constructor 2 con nuevos argumentos
        Caja caja2 = new Caja(2, 4, 6);

        // Llamamos con el nuevo objeto al metodo para un nuevo calculo
        System.out.println("Resultado volumen de caja 2: " + caja2.calcularVolumen());

    }
}
