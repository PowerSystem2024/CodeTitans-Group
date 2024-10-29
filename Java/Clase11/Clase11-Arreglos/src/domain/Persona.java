
package domain;


public class Persona {
    
    private String nombre;//Atributo

    public Persona(String nombre) { //Constructor
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + '}'+", "+super.toString();
    }
    
    
    
    
}
