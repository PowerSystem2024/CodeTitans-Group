package domain;

public class Persona {

    public final static int MI_CONSTANTE = 15; // Constante de la clase no se puede modificar su valor

    // Agregamos un atributo de tipo private
    private String nombre;

    // Agregamos los metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Metodo imprimir");
    }
}