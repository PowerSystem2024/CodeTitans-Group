package domain;

import java.util.Date;

public class Cliente extends Persona{

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;



    public Cliente( String nombre, String direccion,
                   int edad, String genero, Date fechaRegistro, boolean vip){

        super(nombre, direccion, edad, genero);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;

    }

    public int getIdCliente() {
        return idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
