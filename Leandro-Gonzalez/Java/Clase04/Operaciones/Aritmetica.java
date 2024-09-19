package Java.Clase04.Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

    // El constructor es un metodo especial
    // En este constructor estamos "omitiendo valores"
    public Aritmetica() { // Constructor numero 1 vacio
        System.out.println("Se esta ejecutando este constructor numero uno");
    }

    // Estamos viendo lo que se llama sobrecarga de constructores
    // En este constructor estamos "Asignando valosres"
    public Aritmetica(int a, int b) { // Constructor numero 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando este constructor numero dos");
    }

    // Metodo / "void" no devuelve nada
    public void sumarNumeros() {
        // Adentro esta el cuerpo de la clase
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }

    // Creamos otro metodo
    public int sumarConRetorno() {
        // int resultado = a + b;
        return a + b;
    }

    // Creamos otro metodo
    public int sumarConArgumentos(int a, int b) {
        // Uso del operador "this"
        this.a = a; // El argumento "a" se asigna al atributo "this.a"
        this.b = b;
        return a + b;
    }
}
