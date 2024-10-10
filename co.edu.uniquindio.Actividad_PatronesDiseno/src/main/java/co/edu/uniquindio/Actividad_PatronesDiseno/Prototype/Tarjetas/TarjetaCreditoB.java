package co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.Tarjetas;

import co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.Services.IPrototipo;

public class TarjetaCreditoB implements IPrototipo {
    protected String nombreTitular;
    protected int cvv;
    protected String numeroTarjeta;
    public TarjetaCreditoB(String nombreTitular, int cvv, String numeroTarjeta) {
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
        this.numeroTarjeta = numeroTarjeta;

    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public IPrototipo clonar() {
    return new TarjetaCreditoB(nombreTitular,cvv,numeroTarjeta) ;


    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    @Override
    public String toString() {
        return "TarjetaCreditoB{" +
                "nombreTitular='" + nombreTitular + '\'' +
                ", cvv=" + cvv +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                '}';
    }
}
