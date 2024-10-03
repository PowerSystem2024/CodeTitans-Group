package Java.Clase08.ContextoEstatico.domain;

public class Persona {
    // creamos los atributos de la clase
    private int idPersona;
    private static int contadorPersonas;
    private String nombre;

    // creamos el constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        // incrementamos el contador por cada objeto nuevo
        Persona.contadorPersonas++; // no utilizar el operador this
        // asignamos el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    // creamos los métodos getter y setter
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // creamos el método toString
    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
