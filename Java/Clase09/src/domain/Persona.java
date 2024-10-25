package domain;

public class Persona {
    //esta pensado para el concepto de herencia
    protected String nombre;
    protected String genero;
    protected int edad;
    protected String direccion;

    //Constructor vacio: este es para crear objetos sin necesitadad
    //de inciarlizar los atributos de la clase
    public Persona(){ //Constructor 1

    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, String direccion, int edad, String genero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona(nombre=").append(nombre).append('\'');
        sb.append(", genero=").append(genero).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
