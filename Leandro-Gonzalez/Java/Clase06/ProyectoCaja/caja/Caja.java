package Java.Clase06.ProyectoCaja.caja;

public class Caja { // Clase publica "caja"
    // Atributos (caracteristicas)
    int ancho;
    int alto;
    int profundo;

    // Metodos y constructores (acciones)
    public Caja() { // Constructor 1 = vacio
    }

    // Constructor con parametros
    public Caja(int ancho, int alto, int profundo) { // Constructor 2

        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // Metodo para calcular
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}
