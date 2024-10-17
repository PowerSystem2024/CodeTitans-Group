package Java.Clase09.Herencia.domain;

public class Empleado extends Persona { // clase hija
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; // Es para incrementar el idEmpleado

    // constructores
    public Empleado() { // Constructor 1 vacío
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }

    public Empleado(String nombre, double sueldo) { // Constructor 2 con parámetros
        // super(nombre);
        this(); // Llama al constructor vacío (llamar a un contructor interno)
        this.nombre = nombre; // Se puede acceder a los atributos protegidos de la clase padre
        this.sueldo = sueldo;
    }

    // getters y setters
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
