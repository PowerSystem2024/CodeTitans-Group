package domain;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Usamos el metodo toString
    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + '}' + ". " + super.toString();
    }
}
