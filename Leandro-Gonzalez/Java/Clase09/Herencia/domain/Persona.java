package Java.Clase09.Herencia.domain;

public class Persona {
    // Atributos de herencia
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    // Constructor vacío: para crear objetos sin inicializar atributos
    public Persona() { // Constructor 1
    }

    // Constructor con parámetros: para crear objetos inicializando atributos
    public Persona(String nombre) { // Constructor 2
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) { // Constructor 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método toString con la clase StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString()); // para mostrar el espacio de memoria
        sb.append('}');
        return sb.toString();
    }

}
