package Java.Clase09.Herencia.domain;

import java.util.Date; // Importamos la clase Date

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip; // true si es VIP, false si no lo es
    private static int contadorClientes; // Es para incrementar el idCliente tipo static

    // Constructor
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion); // Llamamos al constructor de la clase padre
        this.idCliente = ++Cliente.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    // Getters y Setters

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(this.idCliente);
        sb.append(", fechaRegistro=").append(this.fechaRegistro);
        sb.append(", vip=").append(this.vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
