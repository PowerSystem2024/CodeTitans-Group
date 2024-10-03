package Java.Clase07.Encapsulamiento.dominio;

public class Persona {
    // Atributos de la clase
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    // Constructor
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    // Métodos de la clase
    public String getNombre() { // Método getter
        return this.nombre; // Retornamos el valor del atributo nombre
    }

    public void setNombre(String nombre) { // Método setter
        this.nombre = nombre; // Asignamos el valor del parámetro al atributo nombre
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { // Método getter para atributos booleanos
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    // Método toString convierte en una cadena de texto la información de un objeto
    public String toString() {
        return "Persona [nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]";
    }

}
