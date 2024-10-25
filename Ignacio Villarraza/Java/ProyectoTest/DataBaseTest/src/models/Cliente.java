package models;

public class Cliente { // clase cliente
    // atributos
    private int dni; // Documento de identidad del cliente
    private String nombre; // Nombre del cliente
    private String apellido; // Apellido del cliente
    private String email; // Email del cliente
    private String telefono; // Teléfono del cliente
    private String fechaNacimiento; // Fecha de nacimiento del cliente
    private String direccion; // Dirección del cliente
    private String codigoPostal; // Código postal del cliente
    private String provincia; // Provincia del cliente
    private double saldo; // Saldo del cliente
    private boolean activo; // Estado de actividad del cliente (true: activo, false: inactivo)

    /**
     * Constructor de la clase Cliente.
     * 
     * @param dni             Documento de identidad del cliente.
     * @param nombre          Nombre del cliente.
     * @param apellido        Apellido del cliente.
     * @param email           Email del cliente.
     * @param telefono        Teléfono del cliente.
     * @param direccion       Dirección del cliente.
     * @param codigoPostal    Código postal del cliente.
     * @param provincia       Provincia del cliente.
     * @param saldo           Saldo del cliente.
     * @param activo          Estado de actividad del cliente (true: activo, false:
     *                        inactivo).
     * @param fechaNacimiento Fecha de nacimiento del cliente.
     */

    public Cliente(int dni, String nombre, String apellido, String email, String telefono, String direccion,
            String codigoPostal, String provincia, double saldo, boolean activo, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.saldo = saldo;
        this.activo = activo;
    }

    // Getters y Setters para cada atributo...

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Método toString() (opcional, pero útil para mostrar la información del
    // cliente)
    @Override
    public String toString() {
        return "Cliente{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", provincia='" + provincia + '\'' +
                ", saldo=" + saldo +
                ", activo=" + activo +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

}
