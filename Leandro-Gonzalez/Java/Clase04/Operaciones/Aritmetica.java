package Java.Clase04.Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

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
