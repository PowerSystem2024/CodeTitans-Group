package domain;

public class Persona {

    //cargamos los atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;


    //constructor
    public Persona(String nombre){

        this.nombre = nombre;

        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; //no utilizar operador this

        //Vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;


    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override //esta anotacion agrega informacion extra
    //nos indica que estamos sobreescribiendo el metodo toString
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
